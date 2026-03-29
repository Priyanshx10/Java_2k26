# 📊 Java Data Types

## 📌 Overview

This project explains the concept of **Data Types in Java**, which define the type of data a variable can store and how memory is allocated.

---

## 🧠 Definition

Data types in Java specify the kind of data a variable can hold, such as integers, decimals, characters, or boolean values.

---

## 🔑 Types of Data Types

### 🔹 1. Primitive Data Types

Primitive data types store **actual values** directly in memory.

| Data Type | Size          | Example             |
| --------- | ------------- | ------------------- |
| `byte`    | 1 byte        | `byte a = 10;`      |
| `short`   | 2 bytes       | `short b = 100;`    |
| `int`     | 4 bytes       | `int c = 1000;`     |
| `long`    | 8 bytes       | `long d = 10000L;`  |
| `float`   | 4 bytes       | `float e = 10.5f;`  |
| `double`  | 8 bytes       | `double f = 20.99;` |
| `char`    | 2 bytes       | `char g = 'A';`     |
| `boolean` | JVM dependent | `boolean h = true;` |

---

### 🔹 2. Non-Primitive Data Types

Non-primitive data types store **references (memory address)** instead of actual values.

- `String`
- Arrays
- Classes / Objects

---

## 💻 Example

```java
int age = 25;
double salary = 50000.75;
char grade = 'A';
boolean isWorking = true;
String name = "Java";
```

---

## ⚠️ Rules

- Use `L` for long values
- Use `f` for float values
- `char` uses single quotes `'A'`
- `String` uses double quotes `"Java"`
- Java is strongly typed (type must be declared)

---

## ⚡ Important Points (Interview Gold)

- `int` is most commonly used for integers
- `double` is preferred over `float` due to higher precision
- `char` stores a single character using `' '`
- `String` is **not a primitive type**
- `boolean` can only store `true` or `false`
- Primitive types are faster and use less memory
- Non-primitive types provide more flexibility and functionality

---

## 🎯 Conclusion

Data types are a fundamental concept in Java programming. They define what kind of data can be stored, how much memory is used, and how operations on that data behave.

---

## 📌 Author

**Priyansh**
Java Developer 🚀
