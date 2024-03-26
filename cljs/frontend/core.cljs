(ns frontend.core
  (:require [uix.core :as uix :refer [defui $]]
            [uix.dom]

            ["@nextui-org/react" :refer [Table TableHeader TableColumn TableBody TableRow TableCell]]))

(defui TmpComponent []
  ($ Table
     ($ TableHeader
        ($ TableColumn "A")
        ($ TableColumn "B")
        ($ TableColumn "C"))
     ($ TableBody
        ($ TableRow {:key 1}
           ($ TableCell "A1")
           ($ TableCell "B1")
           ($ TableCell "C1")))))

(defui app []
  ($ :<>
     ($ :div.bg-red-300 "hello world!!!")
     ($ TmpComponent)))

(defonce root
  (uix.dom/create-root (js/document.getElementById "root")))

(defn ^:dev/after-load render []
  (uix.dom/render-root ($ app) root))

(defn ^:export init []
  (render))