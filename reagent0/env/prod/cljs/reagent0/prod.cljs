(ns reagent0.prod
  (:require [reagent0.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
