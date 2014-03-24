(ns btc.bitcoinj.address)

(defn create [address net]
  (com.google.bitcoin.core.Address. net address ))

(defn to-string [address]
  (.toString address))

(defn hash-code [address]
  (.hashCode address))

(defn get-version [address]
  (.getVersion address))
