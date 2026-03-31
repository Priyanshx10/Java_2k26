# Java Narrowing Conversion & Overflow Guide

## 📌 Overview

When converting a larger data type (like `int`) to a smaller data type (like `byte`), Java performs a narrowing conversion. This may lead to overflow, causing unexpected results.

---

## 🔹 Key Terminology

### 1. Type Casting

Explicit conversion between data types.

### 2. Narrowing Conversion

Converting larger → smaller type (e.g., `int → byte`).

### 3. Overflow

Occurs when value exceeds the target type range.

### 4. Wrap-around

Values cycle within a fixed range.

### 5. Modulo Arithmetic

Internal calculation:

```text
value % 256
```

### 6. Two’s Complement

Binary representation used for signed numbers.

---

## 🔹 Byte Range

```text
-128 to 127
```

---

## 🔹 Examples

### ✔ No Overflow

```java
int num = 50;
byte b = (byte) num;
```

---

### ❌ Overflow Example

```java
int num = 130;
byte b = (byte) num; // -126
```

---

### ❌ Large Number

```java
int num = 300;
byte b = (byte) num; // 44
```

---

### ❌ Negative Overflow

```java
int num = -130;
byte b = (byte) num; // 126
```

---

## 🔹 Use Cases

- Memory optimization
- Low-level programming (networking, file handling)
- Embedded systems
- Circular data structures

---

## ⚠️ Important Notes

- Overflow does NOT throw errors
- Data may be silently corrupted
- Always validate before casting

---

## 🚀 Conclusion

Narrowing conversion in Java can lead to overflow due to limited storage capacity. Understanding modulo arithmetic and two’s complement is essential for writing safe and predictable programs.
