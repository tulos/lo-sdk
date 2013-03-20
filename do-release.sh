#!/bin/bash

echo "Unzipping jars in lo-sdk-jars/..."
cd lo-sdk-jars/
for x in *.jar; do
    unzip -o $x;
done
cd ..
rm -rf lo-sdk-jars/META-INF/

echo "Creating uberjar"
lein uberjar

echo "Creating pom.xml"
lein pom

file=`ls target/lo-sdk-*-standalone.jar`

if [[ ! -f ${file} ]]; then
    echo "Error: ${file} doesn't exist!"
    exit 1
fi

echo "Moving ${file} to ${file/-standalone/}."
mv ${file} ${file/-standalone/}
file=${file/-standalone/}

cmd="scp pom.xml ${file} clojars@clojars.org:"

echo "Are you really sure you want to upload ${file} to clojars.org?"
echo "  Command: ${cmd}"
echo "Hit Ctrl-C to abort, or RETURN to upload."
read

eval ${cmd}

echo "Finished!"
