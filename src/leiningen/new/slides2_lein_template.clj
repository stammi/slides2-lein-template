(ns leiningen.new.slides2-lein-template
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "slides2-lein-template"))

(defn slides2-lein-template
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             [(str "src-cljs/" (:sanitized data) "/main.cljs" ) (render "main.cljs" data)]
             ["resources/public/style.css" (render "style.css")]
             ["resources/public/img/erdferkel.png" (render "erdferkel.png")]
             ["resources/public/svg/001_sample-slide.svg" (render "001_sample_slide.svg")]
             ["resources/public/svg/002_sample-slide-with-image.svg" (render "002_sample_slide_with_image.svg")]
             ["resources/public/index.html" (render "index.html" data)])))
