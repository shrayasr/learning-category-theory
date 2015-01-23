(ns category-theory.core
  (:gen-class))

(defn iden [arg]
  arg)

(defn compose [fn1 fn2]
  (fn [arg]
    (fn1 (fn2 arg))))

(defn add1 [arg]
  (+ 1 arg))

(defn mul5 [arg]
  (* 5 arg))

(defn -main 
  []
  (println (iden 1))
  (let [mul5-then-add1 (comp add1 mul5)]
    (println (mul5-then-add1 10)))
  (let [id-then-fn (comp add1 iden)]
    (println (id-then-fn 10)))
  (let [fn-then-id (comp iden add1)]
    (println (fn-then-id 10))))
