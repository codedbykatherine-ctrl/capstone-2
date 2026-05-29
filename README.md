






# 🌮 Viva La Vida Tacos 🌮

## Overview

Viva La Vida Tacos is a Java command-line ordering application where customers can build custom tacos, order drinks, add chips & salsa, and receive a receipt at checkout. The project was built using object-oriented programming principles and focuses heavily on menu navigation, object interaction, enums, ArrayLists, and file writing.

The application allows users to:

* Create multiple tacos in one order
* Customize taco size, shell, meats, cheeses, toppings, and sauces
* Add drinks with different sizes and flavors
* Add chips & salsa with different salsa choices
* View a full receipt before checkout
* Save completed receipts into a receipt file

---

## 🌮 Features

### Home Screen

* Start a new order
* Exit the application

### Order Screen

* Add Taco
* Add Drink
* Add Chips & Salsa
* Checkout
* Cancel Order

### Taco Customization

Customers can:

* Choose taco style:

  * Single Taco
  * 3-Taco Plate
  * Burrito
* Choose shell type:

  * Corn
  * Flour
  * Hard Shell
  * Bowl
* Add premium toppings:

  * Meats
  * Cheese
* Add regular toppings
* Add multiple sauces
* Cover taco in salsa and queso

### Drinks

Drink sizes use enums to safely store valid choices and prices:

* Small
* Medium
* Large

### Chips & Salsa

Customers can choose salsa types using a shared Sauce enum:

* Salsa Verde
* Salsa Roja
* Chipotle
* Habanero
* Mild
* Extra Hot

### Checkout

At checkout, the application:

* Displays the entire order
* Shows all tacos, drinks, and chips
* Calculates the total order price
* Confirms the order before saving

### Receipt System

Completed orders are saved into a receipt file using file writing.

---

## 🧠 Concepts Used

* Classes & Objects
* Encapsulation
* Getters & Setters
* Enums
* ArrayLists
* Loops
* Conditional Logic
* File Writing
* Object Composition
* Menu Navigation
* Methods & Parameters

---

## ⭐ Favorite Parts of the Project

One of my favorite parts of this project was working with enums and switch/if logic to build topping and sauce selection systems. I especially enjoyed creating the topping selection loop where users could continuously choose toppings while removing already-selected options from the available list.

Another part I enjoyed was building the receipt system and learning how objects interact together during checkout. Seeing the tacos, drinks, chips, and totals all combine into one receipt made the project finally feel like a real application.

---

## ⚠️ Challenges

The most difficult part of this project was the receipt and checkout system. Managing loops, method calls, object lists, and file writing all at once became confusing at times, especially while trying to keep track of braces and nested conditionals.

This project also helped me better understand:

* How objects communicate with one another
* Why methods need parameters
* How enums can organize and protect valid choices
* How ArrayLists store multiple objects inside another object

---

## 🛠 Technologies Used

* Java
* IntelliJ IDEA
* ArrayLists
* Enums
* BufferedWriter
* FileWriter

---

## 🌮 Viva La Vida Motto

> “tacos so good u might text ur ex”
