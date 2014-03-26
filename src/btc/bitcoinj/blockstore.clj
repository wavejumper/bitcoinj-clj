(ns btc.bitcoinj.blockstore
  (:import com.google.bitcoin.store.PostgresFullPrunedBlockStore
           com.google.bitcoin.store.H2FullPrunedBlockStore
           com.google.bitcoin.store.MemoryFullPrunedBlockStore))

(defn create-memory
  "Creates a new instance of MemoryFullPrunedBlockStore"
  [net full-store-depth]
  (MemoryFullPrunedBlockStore. net full-store-depth))

(defn create-h2
  "Creates a new instance of H2FullPrunedBlockStore"
  [net db full-store-depth & cache-size]
  (H2FullPrunedBlockStore. net db full-store-depth cache-size))

(defn create-postgres
  "Creates a new instance of PostgresFullPrunedBlockStore"
  [net full-store-depth host db user pass]
  (PostgresFullPrunedBlockStore. net full-store-depth host db user pass))

(defn close [blockstore]
  (.close blockstore))

(defn get-stored-block
  ([blockstore sha-256-hash] (.get blockstore sha-256-hash))
  ([blockstore sha-256-hash undoable-only?] (.get blockstore
                                                  sha-256-hash
                                                  undoable-only?)))
