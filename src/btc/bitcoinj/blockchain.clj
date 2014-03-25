(ns btc.bitcoinj.blockchain
  (:import com.google.bitcoin.core.BlockChain))

(defn create
  ([net blockstore] (BlockChain. net blockstore))
  ([net wallet blockstore]
     (BlockChain. net wallet blockstore)))
