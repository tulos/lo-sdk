(defproject tulos/lo-sdk "4.0.0-SNAPSHOT"
  :description "Wrapping up the LibreOffice java SDK jars into a lein project."
  :url "http://github.com/tulos/lo-sdk/"
  :license {:name "Various"
            :url "http://raw.github.com/tulos/lo-sdk/master/LICENSE.txt"}
  ;; Where are the LO-SDK class files?
  :filespecs [{:type :path :path "lo-sdk-jars"}]
  :jar-exclusions [#".*\.(jar)$"]
  :uberjar-exclusions [#".*\.(jar)$"])
