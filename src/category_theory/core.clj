(ns category-theory.core
  (:gen-class))

(defn id [& args]
  (identity args))

(def add1 (partial + 1))

(def sub5 (partial - 5))

(defn compo [fn1 fn2]
  (comp fn1 fn2))

(defn -main 
  []
  (println (id 1 2 3))
  (let [sub-and-add (compo add1 sub5)]
    (println (sub-and-add 10))))
