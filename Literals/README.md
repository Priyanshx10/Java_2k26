# 📌 Java Literals

## 📌 Overview

This project explains the concept of **Literals in Java**, which are fixed values directly assigned to variables in a program.

---

## 🧠 Definition

Literals in Java are constant values that are written directly in the code. They represent fixed data such as numbers, characters, strings, or boolean values.

---

## 🔑 Types of Literals

### 🔹 1. Integer Literals

- Decimal → `10`
- Binary → `0b1010`
- Octal → `012`
- Hexadecimal → `0xA`

---

### 🔹 2. Floating-Point Literals

- `float` → `10.5f`
- `double` → `20.99`

---

### 🔹 3. Character Literals

- Single character → `'A'`
- Unicode → `'\u0041'`

---

### 🔹 4. String Literals

- `"Java"`

---

### 🔹 5. Boolean Literals

- `true`
- `false`

---

### 🔹 6. Null Literal

- `null`

---

## 💻 Example

```java id="6k0md4"
public class Literals {
    public static void main(String[] args) {

        int num = 10;
        float price = 10.5f;
        char grade = 'A';
        String name = "Java";
        boolean isValid = true;
        String data = null;

        System.out.println(num);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(isValid);
        System.out.println(data);
    }
}
```

---

## ⚠️ Rules

- Use `f` for float values
- Use `' '` for `char` and `" "` for `String`
- `null` is used only with reference types
- Integer literals can be written in multiple formats (binary, octal, hex)

---

## ⚡ Important Points (Interview Gold)

- `0b` is used for binary literals
- `0x` is used for hexadecimal literals
- `float` requires `f` suffix
- `char` stores only a single character
- `String` is not a primitive type
- `null` represents absence of value

---

## 🎯 Conclusion

Literals are fundamental in Java as they provide fixed values that can be assigned to variables. Understanding literals helps in writing accurate and efficient programs.

---

## 📌 Author

**Priyansh**
Java Developer 🚀
