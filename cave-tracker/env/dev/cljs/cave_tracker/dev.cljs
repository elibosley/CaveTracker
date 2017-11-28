(ns ^:figwheel-no-load cave-tracker.dev
  (:require
    [cave-tracker.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
