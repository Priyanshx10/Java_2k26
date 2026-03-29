# 🧠 Java Variables

## 📌 Overview

This project demonstrates the concept of **variables in Java**, including different data types and how they are used to store and manipulate data in a program.

---

## 🧠 What is a Variable?

A **variable** in Java is a named container used to store data values. Each variable has a specific **data type**, which defines the kind of data it can hold, such as numbers, text, or boolean values.

---

## 🔑 Syntax

```java
dataType variableName = value;
```

---

## 💻 Example Code

```java
package Variable;

public class Variable {
    public static void main(String[] args) {
        int age = 25;
        String name = "Priyansh";
        long marks = 90L;
        float percentage = 90.0f;

        System.out.println(name + " is " + age + " years old and scored "
            + marks + " marks which is equivalent to " + percentage + "%.");
    }
}
```

---

## 🧩 Types of Variables

### 🔹 Primitive Data Types

- `int` → stores integer values
- `long` → stores large integer values
- `float` → stores decimal values
- `boolean` → stores true/false
- `char` → stores single character

### 🔹 Non-Primitive Data Types

- `String` → stores text
- Arrays → store multiple values
- Objects → represent real-world entities

---

## ⚠️ Important Rules

- Variable names cannot start with a number
- No spaces allowed in variable names
- Java is case-sensitive (`age` ≠ `Age`)
- Use `L` for long values and `f` for float values

---

## 🎯 Example Output

```text
Priyansh is 25 years old and scored 90 marks which is equivalent to 90.0%.
```

---

## 🚀 Learning Outcome

By completing this example, you will understand:

- How to declare and initialize variables
- Different data types in Java
- How to print variable values
- Basic structure of a Java program

---

## 📚 Conclusion

Variables are the foundation of Java programming. They allow developers to store and manipulate data efficiently and are essential for building any real-world application.

---

## 📌 Author

**Priyansh**
Java Developer 🚀
