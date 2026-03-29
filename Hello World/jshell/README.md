# 🟨 JShell Practice & Learning Guide

## 📌 Overview

This repository contains hands-on practice examples and concepts using **JShell**, an interactive Java tool that allows developers to execute Java code instantly without creating full programs.

It is designed for beginners who want to quickly learn, test, and experiment with Java concepts.

---

## 🧠 What is JShell?

**JShell** is an interactive command-line tool introduced in Java 9 that enables developers to write and execute Java code snippets in real time. It follows the REPL (Read-Eval-Print Loop) approach, making learning and debugging faster and easier.

---

## 🚀 Why Use JShell?

- No need to create full Java classes
- Instant execution and output
- Ideal for beginners and quick testing
- Helps in understanding Java concepts faster
- Useful for debugging small logic

---

## ⚙️ How to Start JShell

```bash
jshell
```

To exit:

```bash
/exit
```

---

## 💻 Practice Examples

### 🔹 Basic Operations

```java
1 + 2;
int a = 10;
int b = 20;
a + b;
System.out.println("Hello JShell");
```

---

### 🔹 Variables & Data Types

```java
double pi = 3.14;
boolean isJavaFun = true;
char grade = 'A';
String name = "Java";
name.length();
```

---

### 🔹 Control Statements

```java
if (a > b) {
    System.out.println("A is greater");
} else {
    System.out.println("B is greater");
}

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

### 🔹 Methods

```java
int add(int x, int y) {
    return x + y;
}

add(5, 10);
```

---

### 🔹 Collections

```java
import java.util.*;

List<Integer> list = List.of(1, 2, 3, 4);
list.forEach(System.out::println);
```

---

## ⚠️ Important Notes

- JShell executes code only when the statement is complete
- Multi-line code requires `{}` (curly braces)
- If you see `->`, JShell is waiting for more input

---

## 🛠️ Useful Commands

| Command    | Description          |
| ---------- | -------------------- |
| `/vars`    | Show variables       |
| `/methods` | Show methods         |
| `/history` | Show command history |
| `/edit`    | Open editor for code |

---

## 🎯 When to Use JShell

- Learning Java basics
- Practicing coding problems
- Testing logic quickly
- Exploring new APIs

---

## 📚 Conclusion

JShell is a powerful tool for improving Java skills through instant feedback and interactive coding. It removes the complexity of compiling and running full programs, making it perfect for beginners and professionals alike.

---

## ⭐ Contribution

Feel free to fork this repository and add more examples or improvements!

---

## 📌 Author

**Priyansh**
Java Learner & Developer 🚀
