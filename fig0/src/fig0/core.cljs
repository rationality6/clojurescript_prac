(ns fig0.core
  (:require))

(enable-console-print!)

(def app (js/document.getElementById "app"))
(set! (.-innerHTML app) "Hello !! 개발자 재귀해 재귀")

(def field0 (js/document.getElementById "field0"))
(set! (.-innerHTML field0) "next")

(defn print_list0 [til]
  (def list1 (list 2,3,4))
  (map (fn [i]
         (+ i 2)) list1))

(defn print_list [til]
  (def list0 (list 1 2 3 4 5 6))
  (map
   (fn [i] (+ i 1))
   list0))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have "
    [:strong "bold"]
    [:span {:style {:color "red"}} " and red"] "text."]])

(defn simple-parent []
  [:div
   [:p "I include simple-component."]
   [simple-component]])

(def map0 (js/document.getElementById "map_result0"))

(println (print_list 3))

(def my-list (list 1 2 3))
(println (map
          (fn [i] (+ i 1))
          my-list))

; (defn hello_func [name]
;   `(js/alert) ~(str "Hello" name))
;
; (hello_func "Hyun")

; (defmacro hello [name]
;   `(js/alert) ~(str "Hello"))

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
