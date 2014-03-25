(ns btc.bitcoinj.address
  (:import com.google.bitcoin.core.Address))

(defn create [address net]
  (Address. net address))

(defn to-string [address]
  (.toString address))

(defn hash-code [address]
  (.hashCode address))

(defn get-version [address]
  (.getVersion address))
