(ns btc.utils)

(defn parse-key
  "Returns the Big Integer of the given parsed string"
  [key]
  (biginteger (com.google.bitcoin.core.Utils/parseAsHexOrBase58 key)))
