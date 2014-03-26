(ns btc.bitcoinj.eckey
  (:require [btc.utils :as utils])
  (:import com.google.bitcoin.core.ECKey))

(defn create
  ([] (ECKey. ))
  ([pub-key] (ECKey. nil pub-key))
  ([pub-key priv-key] (ECKey. priv-key pub-key)))

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

(defn ->map
  "Parses ECKey toString method into Clojure map"
  [eckey]
  (utils/parse-eckey-string (.toString eckey)))

(defn ->map-with-private
  "Parses ECKey toStringPrivate method into Clojure map"
  [eckey]
  (utils/parse-eckey-string (.toString eckey)))

(defn ->address [eckey net]
  (.toAddress eckey net))
