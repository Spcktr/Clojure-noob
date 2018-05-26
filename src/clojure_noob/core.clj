(ns clojure-noob.core
  (:gen-class))

(defn -main
  [& args]
  (println "I'm just a small teapot that doesn't do much yet!")
  (if true
    (do (println "Success!")
        "By Zues' Hammer!")
    (do (println "Failure!")
        "By Aquaman's trident!"))
  )
