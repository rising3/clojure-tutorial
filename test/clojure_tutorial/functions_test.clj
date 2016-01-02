(ns clojure-tutorial.functions-test
  (:require [clojure.test :refer :all]
            [clojure-tutorial.functions :refer :all]))

(deftest no-arg-test
  (testing (is (no-arg))))

(deftest is-even-test
  (testing (not (is-even 1)))
  (testing (is (is-even 2))))
