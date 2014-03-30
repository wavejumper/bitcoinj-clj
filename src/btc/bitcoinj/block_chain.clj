(ns btc.bitcoinj.block-chain
  (:import com.google.bitcoin.core.BlockChain))

(defn create
  ([net block-store] (BlockChain. net block-store))
  ([net wallet block-store] (BlockChain. net wallet block-store)))
