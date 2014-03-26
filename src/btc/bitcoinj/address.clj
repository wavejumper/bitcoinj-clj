(ns btc.bitcoinj.address
  (:import com.google.bitcoin.core.Address))

(defn create [address net]
  (Address. net address))

(defn ->string [address]
  (.toString address))

(defn ->hash [address]
  (.getHash160 address))

(defn get-version [address]
  (.getVersion address))
