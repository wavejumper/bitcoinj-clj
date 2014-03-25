(ns btc.bitcoinj.wallet
  (:import com.google.bitcoin.core.Wallet))

(defn create
  ([net] (Wallet. net))
  ([net key-crypter] (Wallet. net key-crypter)))
