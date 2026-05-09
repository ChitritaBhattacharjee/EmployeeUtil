# EmployeeUtil – Java Employee Management System

<div align="center">

## 🚀 Object-Oriented Employee Utility Application

A simple yet structured **Java console-based application** that demonstrates the core concepts of **Object-Oriented Programming (OOP)** including:

✨ Inheritance
✨ Abstraction
✨ Polymorphism
✨ Exception Handling
✨ Collections Framework
✨ Menu-Driven Programming

</div>

---

# 📌 Project Overview

**EmployeeUtil** is a Java-based employee management utility designed to manage different categories of employees such as:

* 👨‍💼 Manager
* 🧾 Clerk
* 💼 Salesman

The application allows users to:

* Add employee details
* Calculate employee salary dynamically
* Store employee objects using collections
* Handle invalid employee registration numbers using custom exceptions
* Display all employee information in a structured format

This project is ideal for beginners learning **Java OOP concepts** and **console application development**.

---

# 🛠️ Tech Stack

| Technology            | Purpose                                  |
| --------------------- | ---------------------------------------- |
| Java                  | Core programming language                |
| OOP Concepts          | Inheritance, Polymorphism, Encapsulation |
| Eclipse IDE           | Development Environment                  |
| Collections Framework | Storing employee objects                 |
| Exception Handling    | Input validation                         |

---

# 📂 Project Structure

```bash
EmployeeUtil-master/
│
├── src/
│   └── com/
│       └── chitrita/
│           ├── Main.java
│           │
│           ├── exception/
│           │   └── EmployeeRegnoException.java
│           │
│           └── models/
│               ├── Employee.java
│               ├── Emp.java
│               ├── Manager.java
│               ├── Clerk.java
│               └── Salesman.java
│
└── README.md
```

---

# ⚙️ Features

## ✅ Employee Categories

The system supports multiple employee types:

| Employee Type | Additional Salary Components      |
| ------------- | --------------------------------- |
| Manager       | Car Allowance + Medical Allowance |
| Clerk         | Overtime Payment                  |
| Salesman      | Travelling Allowance + Commission |

---

## ✅ Salary Computation

Each employee type overrides the salary calculation method using **runtime polymorphism**.

---

## ✅ Exception Handling

A custom exception:

```java
EmployeeRegnoException
```

is used to validate employee registration numbers.

---

## ✅ Menu-Driven Console Interface

Interactive user menu for smooth navigation.

```text
1. for Manager
2. for Clerk
3. for Salesman
0. to Exit
```

---

# 🧠 OOP Concepts Used

| Concept            | Implementation                                |
| ------------------ | --------------------------------------------- |
| Inheritance        | Employee subclasses inherit common properties |
| Abstraction        | Abstract employee behavior                    |
| Polymorphism       | Overridden salary computation methods         |
| Encapsulation      | Private data members with getters/setters     |
| Exception Handling | Custom validation exception                   |

---

# ▶️ How to Run the Project

## 🔹 Using Eclipse IDE

1. Open **Eclipse IDE**
2. Click:

```text
File → Import → Existing Projects into Workspace
```

3. Select the project folder
4. Click **Finish**
5. Run:

```text
Main.java
```

---

## 🔹 Using Command Line

### Step 1: Compile

```bash
javac src/com/chitrita/Main.java
```

### Step 2: Run

```bash
java com.chitrita.Main
```

---

# 📸 Sample Output

```text
1. for Manager
2. for Clerk
3. for Salesman
0. to Exit
Enter your choice: 1

Enter regno: 101
Enter employee name: Chitrita
Enter basic amount: 50000
Enter car allowance: 10000
Enter medical allowance: 5000

Employee details:
Manager [Employee details...]
Employee salary: 65000
```

---

# 🎯 Learning Outcomes

This project helps in understanding:

* Java class hierarchy
* Constructor overloading
* Method overriding
* Collection handling using `ArrayList`
* User input handling using `Scanner`
* Custom exception creation
* Console-based application design

---

# 🚧 Future Enhancements

Possible improvements for this project:

* ✅ GUI using Java Swing or JavaFX
* ✅ Database integration using MySQL
* ✅ Employee search functionality
* ✅ Employee update/delete operations
* ✅ File handling for persistent storage
* ✅ Spring Boot REST API version

---

# 👩‍💻 Author

## Chitrita Bhattacharjee

🎓 B.Tech CSE Student
💻 Passionate about Java, AI, and Software Development

---

# ⭐ If You Like This Project

Give this repository a ⭐ on GitHub and support the project.

---

<div align="center">

### 💙 Built with Java & OOP Concepts

</div>
