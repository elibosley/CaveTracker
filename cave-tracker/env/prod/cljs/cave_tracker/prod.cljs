(ns cave-tracker.prod
  (:require
    [cave-tracker.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
