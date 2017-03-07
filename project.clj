(defproject de.methodpark/mutation-testing "0.1.0-SNAPSHOT"
  :description "A small Java/Clojure example showing Mutation Testing"
  :url "http://github.com/methodpark/mutation-testing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.pitest/pitest-command-line "1.1.11"]
                 [junit/junit "4.12"]]
  :java-source-paths ["src/java" "test/java"]
  :javac-opts ["-debug" "true"])
