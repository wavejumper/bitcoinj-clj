(ns btc.network)

(defn main-net []
  (com.google.bitcoin.params.MainNetParams. ))

(defn test-net2 []
  (com.google.bitcoin.params.TestNet2Params. ))

(defn test-net3 []
  (com.google.bitcoin.params.TestNet3Params. ))
