(ns btc.utils
  (:require [clojure.string :as string]
            [clojure.walk :as walk])
  (:import com.google.bitcoin.core.Utils))

(defn parse-key
  "Returns the Big Integer of the given parsed string"
  [key]
  (biginteger (Utils/parseAsHexOrBase58 key)))

(defn parse-eckey-string
  "Parses string in format 'a:b c:d' into array-map"
  [s]
  (let [items (string/split s #" ")]
    (walk/keywordize-keys
     (into {} (map #(string/split % #":") items)))))
