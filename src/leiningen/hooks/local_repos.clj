(ns leiningen.hooks.local-repos
  (:use [robert.hooke :only [add-hook]]
        [leiningen.core :only [user-settings]]))

(defn local-repositories []
  ((user-settings) :local-repositories))

(alter-var-root #'leiningen.core/default-repos
                merge (local-repositories))
(alter-var-root #'leiningen.core/default-repos
                merge (dissoc (local-repositories) "central"))
