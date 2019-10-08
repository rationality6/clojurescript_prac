(defn fizzbuzz [x]
  (def list0 (range 1 x))
  (for [y list0]
    (if (and (= (rem y 3) 0) (= (rem y 5) 0)) "fizzbuzz"
        (if (= (rem y 3) 0) "fizz"
            (if (= (rem y 5) 0) "buzz" y)))))

(fizzbuzz 16)

(condp some [1 2 3 4])
(pre (* 2 3))

(require '[clojure.core.match :refer [match]])
(require '[clojure.core.match :refer [match]])

(defn fizzbuzz [x]
  (let [v [(= (mod x 3) 0) (= (mod x 5) 0)]]
    ({[true false] "fizz"
      [false true] "buzz"
      [true true] "fizzbuzz"
      [false false] x} v)))

(fizzbuzz 17)

(def java_result (.toUpperCase "hello world"))
(def clojure_result (clojure.string/upper-case "hello world"))
(= java_result clojure_result)


(defn fizzbuzz [x]
  (let [v [(= (mod x 3) 0) (= (mod x 5) 0)]]
    ({[true false] "fizz"
      [false true] "buzz"
      [true true] "fizzbuzz"
      [false false] x} v)))

(println fizzbuzz 8)

(ns my.match
  (:require [cljs.core.match :refer-macros [match]]))

(if false
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(+ 1 2 3)

(str "이렇게" "작동을" "합니다")

(when false
  println "foobar"
  "잉?")

(nil? 1)
(nil? nil)

(= 1 1)
(= nil nil)
(= 1 2)

(or false nil :large_I :why)
(or nil)
(or true nil "true" "false")

(and :a :b)

(or false nil false 2)

(and true "foo" "bar")

(def failed
  ["Larry " "Doreen"])

failed
()
(nth (list "foo" :fofo ) 0)
