(ns clojure-tutorial.values-test
  (:require [clojure.test :refer :all]
            [clojure.string :refer :all]
            [clojure-tutorial.values :refer :all]))

(deftest long-val-test
  (testing (is (= long-val1 12)))
  (testing (is (= long-val2 2)))
  (testing (is (number? long-val1)))
  (testing (is (number? long-val2)))
  (testing (is (integer? long-val1)))
  (testing (is (integer? long-val2))))

(deftest bigint-val-test
  (testing (is (= bigint-val1 7N)))
  (testing (is (number? bigint-val1)))
  (testing (is (integer? bigint-val1))))

(deftest double-val-test
  (testing (is (= double-val1 12.34)))
  (testing (is (number? bigint-val1)))
  (testing (is (integer? bigint-val1))))

(deftest decimal-val-test
  (testing (is (= decimal-val1 12.34M)))
  (testing (is (decimal? decimal-val1))))

(deftest ratio-val-test
  (testing (is (= ratio-val1 1/3)))
  (testing (is (= ratio-val2 1/3)))
  (testing (is (ratio? ratio-val1)))
  (testing (is (ratio? ratio-val2)))
  (testing (is (rational? ratio-val1)))
  (testing (is (rational? ratio-val2))))

(deftest char-val-test
  (testing (is (= char-val1 \A)))
  (testing (is (char? char-val1))))

(deftest string-val-test
  (testing (is (= string-val1 "Hello, Clojure.")))
  (testing (is (= string-val2 "   ")))
  (testing (is (string? string-val1)))
  (testing (is (string? string-val2)))
  (testing (not (blank? string-val1)))
  (testing (is (blank? string-val2))))

(deftest keyword-val-test
  (testing (is (= keyword-val1 :blue)))
  (testing (is (= keyword-val2 :red)))
  (testing (is (keyword? keyword-val1)))
  (testing (is (keyword? keyword-val2))))

(deftest boolean-val-test
  (testing (is (true? boolean-val1)))
  (testing (is (false? boolean-val2))))

(deftest nil-val-test
  (testing (is (nil? nil-val1)))
  (testing (is (blank? nil-val1))))

