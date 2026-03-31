# Java Type Conversion Guide

## 📌 Overview

Type Conversion in Java is the process of converting one data type into another. It is essential for performing operations involving different data types and ensuring compatibility.

---

## 🔹 Types of Type Conversion

### 1. Implicit Type Conversion (Widening)

- Automatically done by Java
- Converts smaller data type → larger data type
- No data loss

#### Example:

```java
int num = 10;
double result = num;
```

---

### 2. Explicit Type Conversion (Casting)

- Done manually by the programmer
- Converts larger data type → smaller data type
- May cause data loss

#### Example:

```java
double num = 10.75;
int result = (int) num;
```

---

## 🔹 Conversion Hierarchy

```
byte → short → int → long → float → double
```

---

## 🔹 Common Use Cases

### ✔ Arithmetic Operations

```java
int a = 5;
double b = 2.5;
double result = a + b;
```

### ✔ String to Integer

```java
String str = "100";
int num = Integer.parseInt(str);
```

### ✔ Integer to String

```java
int num = 100;
String str = String.valueOf(num);
```

---

## ⚠️ Important Notes

- Explicit casting may lead to data loss
- Implicit conversion is safe and automatic
- Always ensure correct data type before conversion

---

## 🚀 Conclusion

Type conversion is a fundamental concept in Java that helps in:

- Handling mixed data types
- Optimizing memory usage
- Working with user input and APIs

Understanding both implicit and explicit conversions is essential for writing efficient and bug-free Java programs.
