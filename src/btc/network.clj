(ns btc.network
  (:import com.google.bitcoin.params.MainNetParams
           com.google.bitcoin.params.TestNet2Params
           com.google.bitcoin.params.TestNet3Params))

(defn main-net [] (MainNetParams. ))

(defn test-net2 [] (TestNet2Params. ))

(defn test-net3 [] (TestNet3Params. ))
