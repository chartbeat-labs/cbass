(defproject cbass "0.2.3-SNAPSHOT"
  :description "adding simple to HBase"
  :url "https://github.com/tolitius/cbass"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src" "src/cbass"]

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.apache.hbase/hbase-shaded-client "1.4.8"]
                 [aesahaettr "0.1.2"]
                 [com.taoensso/nippy "2.14.0"]]
  :global-vars {*warn-on-reflection* true}
  :aot :all
  :repositories {"cloudera"
                 {:url "https://repository.cloudera.com/artifactory/cloudera-repos"}})
