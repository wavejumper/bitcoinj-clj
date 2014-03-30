(ns btc.bitcoinj.wallet
  (:require [btc.bitcoinj.eckey :as eckey]
            [btc.utils :as utils])
  (:import com.google.bitcoin.core.Wallet
           com.google.bitcoin.core.WalletEventListener
           java.io.File))

(defn create
  ([net] (Wallet. net))
  ([net key-crypter] (Wallet. net key-crypter)))

(defn add-keys [wallet & eckeys]
  (.addKeys wallet eckeys)
  wallet)

(defn remove-key [wallet eckey]
  (.removeKey wallet eckey)
  wallet)

(defn add-new-encrypted-key [wallet & password]
  (.addNewEncryptedKey wallet (str password))
  wallet)

(defn encrypt [wallet password]
  (.encrypt wallet (str password))
  wallet)

(defn has-key? [wallet] (.hasKey wallet))

(defn is-encrypted? [wallet] (.isEncrypted wallet))

(defn save-to-file [wallet path] (.saveToFile wallet (File. path)))

(defn ->string [wallet] (.toString wallet))
