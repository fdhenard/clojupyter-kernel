(ns user)

(defn user-ver
  "doesn't work when running as jar"
  []
  (-> "project.clj" slurp read-string (nth 2)))


(comment

  (user-ver)


  )
