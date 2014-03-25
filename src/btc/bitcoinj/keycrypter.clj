(ns btc.bitcoinj.keycrypter
  (:import com.google.bitcoin.crypto.KeyCrypterScrypt))

(defn create [] (KeyCrypterScrypt. ))
