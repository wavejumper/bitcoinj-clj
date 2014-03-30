(ns btc.bitcoinj.key-crypter
  (:import com.google.bitcoin.crypto.KeyCrypterScrypt))

(defn create [] (KeyCrypterScrypt. ))
