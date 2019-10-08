(:fred "ethel")
*ns*

(ns alice.favfoods)
(def foobar [1 1 1 1])
alice.favfoods/foobar
(def ethel "ethel")
(println "hel")

[1 2 :a :b :c]
(1 2 (a b c) 4 5)

{1 "one", 2 "two", 3 "three"}
#{1 2 3 3}

(= [1 2] [1 2])

(throw (Exception. "I done throwed"))

(try
  (throw (Error. "I done throwed in CLJS"))
  (catch js/Error err "I done catched in CLJSfff"))

(ns )
