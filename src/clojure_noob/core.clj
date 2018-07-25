(ns clojure-noob.core
  (:gen-class))

(defn -main
  [& args]

  (let [fruit-count {:apple 2 :banana 12 :orange 5 :lemon 6
                      :watermelon 1 :plums 0 :lime 40}
        fruit-cost {:apple 2.00 :banana 0.05 :orange 4.00 :lemon 3.00
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

(def my-mult
  (fn [x y]
    (* x y)))

; arity
(defn square-or-multi
  "squares a single, multiplies 2"
  ([] 0)
  ([x] (* x x))
  ([x y] (* x y)))

; variable arity
(defn add-arg-count
  "returns first arg + the number of aditional args"
  [first & more]
  (+ first (count more)))

; cond adds else to if statements allowing different responses to paramters
  (defn weather-judge
   "given a temp in degrees C, comments on weather"
   [temp]
   (cond
   (< temp 20) "its cold"
   (> temp 20) "its hot"
   :else "it's comfortable"))
