(ns btc.bitcoinj.eckey
  (:use [btc.utils]))

(defn create
  ([] (com.google.bitcoin.core.ECKey. ))
  ([pub-key] (com.google.bitcoin.core.ECKey. nil (parse-key pub-key)))
  ([pub-key priv-key] (com.google.bitcoin.core.ECKey (parse-key priv-key)
                                                     (parse-key pub-key))))

(defn has-priv-key? [eckey]
  (.hasPrivKey eckey))

(defn get-pub-key [eckey]
  (.getPubKey eckey))

(defn get-pub-key-hash [eckey]
  (.getPubKeyHash eckey))

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

(defn eckey->address [eckey net]
  (.toAddress eckey net))
