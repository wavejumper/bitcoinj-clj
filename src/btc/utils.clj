(ns btc.utils
  (:import com.google.bitcoin.core.Utils))

(defn parse-key
  "Returns the Big Integer of the given parsed string"
  [key]
  (biginteger (Utils/parseAsHexOrBase58 key)))
