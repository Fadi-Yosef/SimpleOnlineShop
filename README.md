# 🛒 SimpleOnlineShop

## 📖 Overview

**SimpleOnlineShop** is a clean and well-structured Java project designed to demonstrate fundamental Object-Oriented Programming (OOP) principles through a simplified e-commerce system.

The application models a real-world scenario where a customer places an order containing multiple products. The system focuses on core business logic such as product management, order composition, and total price calculation.

---

## 🎯 Objectives

This project was developed to:

* Apply **core OOP principles** (Encapsulation, Composition)
* Practice **class design based on UML**
* Understand **object relationships**
* Build a **maintainable and extendable system**

---

## 🧱 System Design

### 🔹 Class Responsibilities

* **Customer**

  * Represents a user of the system
  * Stores basic identity information

* **Product**

  * Represents a purchasable item
  * Contains name and price

* **Order**

  * Central class of the system
  * Belongs to exactly one customer
  * Contains multiple order items
  * Handles total price calculation and summary output

* **OrderItem**

  * Acts as a bridge between Order and Product
  * Stores quantity of each product
  * Encapsulates price calculation per item



## 🔗 Relationships

* An **Order → Customer** (1-to-1)
* An **Order → OrderItem** (1-to-many)
* An **OrderItem → Product** (many-to-1)

The design follows a **unidirectional relationship model**, ensuring low coupling and simplicity.

---

## ⚙️ Features

* Add products with quantity to an order
* Calculate total order cost dynamically
* Display structured order summary
* Clear separation of responsibilities between classes

---

## 🧮 Example Output

```
Customer: Anna
Number of items: 2
- Notebook x2 = 10.0
- Pen x3 = 4.5
Total price: 14.5
```

---



## 🧪 Design Principles Applied

* **Encapsulation** → All fields are private with controlled access
* **Single Responsibility Principle** → Each class has one clear purpose
* **Composition over inheritance** → Objects are built using relationships
* **Separation of concerns** → Business logic is placed in the correct classes

---

## 🔮 Possible Extensions

* Discount and promotion system
* Tax calculation
* Order history tracking
* Persistence (database integration)
* User interface (CLI or GUI)

---

## 📌 Conclusion

This project provides a solid foundation for understanding how real-world systems can be modeled using object-oriented design. It emphasizes simplicity, clarity, and correctness while remaining easy to extend.

---

## 👨‍💻 Author

Fadi Yosef
