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

  (let [fruit-count {:apple 2 :banana 12 :orange 5 :lemon 6
                      :watermelon 1 :plums 0 :lime 40}
        fruit-cost {:apple 1.00 :banana 0.05 :orange 4.00 :lemon 3.00
                      :watermelon 7.00 :plums 3.00 :lime 0.50}
        total-costs (reduce (fn [m f]
                                (assoc m f  (* (fruit-count f) (fruit-cost f))))
                                {}
                              (keys fruit-count))
        result {:fruit-counts fruit-count
                :fruit-costs fruit-cost
                :total-costs total-costs}]
    result)
  )
