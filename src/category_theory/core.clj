(ns category-theory.core
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn id [& args]
  (identity args))

(defn -main 
  []
  (println (id 1 2 3)))
