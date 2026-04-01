# Java Assignment Operators Guide

## 📌 Overview

Assignment operators in Java are used to assign values to variables. They include simple assignment and compound assignment operators.

---

## 🔹 Types of Assignment Operators

### 1. Simple Assignment

```java
int a = 10;
```

---

### 2. Compound Assignment

| Operator | Example | Equivalent |
| -------- | ------- | ---------- |
| +=       | a += 5  | a = a + 5  |
| -=       | a -= 3  | a = a - 3  |
| *=       | a *= 2  | a = a * 2  |
| /=       | a /= 2  | a = a / 2  |
| %=       | a %= 3  | a = a % 3  |

---

### 3. Bitwise Assignment

| Operator | Description |
| -------- | ----------- |
| &=       | AND         |
| |=       | OR          |
| ^=       | XOR         |
| <<=      | Left shift  |
| >>=      | Right shift |

---

## 🔹 Key Features

* Reduces code length
* Improves readability
* Automatically handles type casting

---

## 🔹 Special Behavior

```java
byte b = 10;
b += 5;  // Works
// b = b + 5; // Error
```

---

## 🔹 Use Cases

* Counters in loops
* Arithmetic operations
* Bit manipulation
* Performance optimization

---

## 🚀 Conclusion

Assignment operators simplify code and improve readability. Compound operators are widely used in real-world Java applications for efficient programming.
