(ns clojure-tutorial.values
  (:gen-class))

;; Long
(def long-val1 12)
(def long-val2 4/2)

;; BigInt
(def bigint-val1 7N)

;; Double
(def double-val1 12.34)

;; Hex
(def hex-val1 0xff)

;; Oct
(def oct-val1 017)

;; Base2
(def base2-val1 2r1011)

;; Decimal
(def decimal-val1 12.34M)

;; Ratio
(def ratio-val1 1/3)
(def ratio-val2 (/ 1 3))

;; Character
(def char-val1 \A)

;; String
(def string-val1 "Hello, Clojure.")
(def string-val2 "   ")

;; Keyword
(def keyword-val1 :blue)
(def keyword-val2 :red)

;; Boolean
(def boolean-val1 true)
(def boolean-val2 false)

;; Nil
(def nil-val1 nil)

