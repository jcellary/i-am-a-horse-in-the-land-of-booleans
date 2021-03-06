(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond
   (number? x) (* x x)
   (or (list? x) (vector? x)) (if (empty? x) nil
                                ((fn [y] (* y y)) (count x)))
   :else true))

(defn leap-year? [year]
  ":(")

; '_______'
