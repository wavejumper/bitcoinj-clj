(ns btc.network-test
  (:require [btc.network :refer :all]
            [clojure.test :refer :all]))

(deftest main-network
  (is (instance? com.google.bitcoin.params.MainNetParams (main-net))))

(deftest test-network2
  (is (instance? com.google.bitcoin.params.TestNet2Params (test-net2))))

(deftest test-network3
  (is (instance? com.google.bitcoin.params.TestNet3Params (test-net3))))
