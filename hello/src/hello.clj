(ns hello
  (:require [hello-time :as ht]))

(defn run [opts]
  (println "Hi, the time is" (ht/time-str (ht/now))))
