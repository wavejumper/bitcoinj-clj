(ns btc.bitcoinj.eckey-test
  (:require [btc.bitcoinj.eckey :refer :all]
            [btc.network :refer :all]
            [clojure.test :refer :all]))

(deftest new-eckey
  (is (instance? com.google.bitcoin.core.ECKey (create))))

(deftest correct-signature
  (let [my-key (create)
        msg "I LIKE TURTLES"
        sig (sign-message my-key msg)]
    (is (nil? (verify-message my-key msg sig)))))

(deftest invalid-signature
  (let [my-key (create)
        msg "I LIKE TURTLES"
        sig (sign-message my-key msg)]
    (is (thrown? Exception (verify-message my-key "FOO" sig)))))

(deftest to-map
  (let [my-key (create)
        my-map (->map my-key)]
    (is (map? my-map))))

(deftest to-address
  (let [net (test-net3)
        my-key (create)
        addr (->address my-key net)]
    (is (instance? com.google.bitcoin.core.Address addr))))
