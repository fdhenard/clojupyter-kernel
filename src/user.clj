(ns user)

(defn user-ver []
  (-> "project.clj" slurp read-string (nth 2)))


(comment

  (user-ver)


  )
