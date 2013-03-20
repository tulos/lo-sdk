(defproject tulos/lo-sdk "4.0.0-SNAPSHOT"
  :description "Wrapping up the LibreOffice java SDK jars into a lein project."
  :url "http://github.com/tulos/lo-sdk/"
  :license {:name "MIT"
            :url "http://tulos.mit-license.org/"}
  ;; Where are the LO-SDK class files?
  :filespecs [{:type :path :path "lo-sdk-jars"}]
  ;;:jar-exclusions [#"(\.git/|PUT_EMF_SDK_JARS_HERE)"]
  :uberjar-exclusions [#".*\.(jar)$"])
