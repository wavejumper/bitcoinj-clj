(ns btc.bitcoinj.eckey
  (:use [btc.utils]))

(defn create [& [pub-key priv-key]]
  (if (and (nil? pub-key) (nil? priv-key))
    (com.google.bitcoin.core.ECKey. )
    (if (nil? priv-key)
      (com.google.bitcoin.core.ECKey. nil (parse-key pub-key))
      (com.google.bitcoin.core.ECKey. (parse-key priv-key)
                                      (parse-key pub-key)))))

(defn is-compressed? [eckey]
  (.isCompressed eckey))

(defn is-encrypted? [eckey]
  (.isEncrypted eckey))

(defn is-pub-key-only? [eckey]
  (.isPubKeyOnly eckey))

(defn sign-message [eckey message]
  (.signMessage eckey message))

(defn verify-message [eckey message signature]
  (.verifyMessage eckey message signature))

(defn to-string [eckey]
  (.toString eckey))

(defn to-address [eckey net]
  (.toAddress (eckey) net))
