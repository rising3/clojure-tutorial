(ns clojure-tutorial.functions
  (:gen-class))

(defn no-arg
  []
  (= true))

(defn is-even
  [x]
  (even? x))
