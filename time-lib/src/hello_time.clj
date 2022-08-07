(ns hello-time
  (:require [java-time :as time]))

(defn now
  []
  (time/instant))

(defn time-str
  [instant]
  (time/format
   (time/with-zone (time/formatter "hh:mm a") (time/zone-id))
   instant))

