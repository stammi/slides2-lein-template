(defproject {{ns-name}} "0.1.0"
  :description "a presentation."
  :url "http://example.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[slides2 "0.1.1"]
                 [org.clojure/clojurescript "0.0-2227"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {
              :builds {:dev {
                             :source-paths ["src-cljs"]
                             :compiler {:output-to "resources/public/gen/main.js"
                                        :optimizations :whitespace
                                        :pretty-print true}}}})
