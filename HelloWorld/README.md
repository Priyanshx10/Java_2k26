# ☕ Java Hello World (Decompiled Version)

## 📌 Overview

This project demonstrates a simple **Hello World Java program**, including a version of the source code that has been **decompiled from a `.class` file** using the FernFlower decompiler (commonly used in IntelliJ IDEA).

It helps in understanding:

- How Java code looks after compilation and decompilation
- The structure of a basic Java program
- How `.class` files relate to `.java` source files

---

## 🧠 What is Decompiled Code?

Decompiled code is Java source code that has been reconstructed from compiled bytecode (`.class` file). Tools like FernFlower attempt to reverse-engineer readable Java code from bytecode.

> Note: Decompiled code may not exactly match the original source code.

---

## 📄 Source Code

```java
class Hello {
   Hello() {
   }

   public static void main(String[] var0) {
      System.out.println("Hello World");
   }
}
```

---

## 🔍 Code Explanation

### 1. Class Declaration

```java
class Hello
```

Defines a class named `Hello`.

---

### 2. Default Constructor

```java
Hello() {
}
```

- This is an automatically generated constructor.
- It is added during compilation if no constructor is explicitly defined.

---

### 3. Main Method

```java
public static void main(String[] var0)
```

- Entry point of the Java program
- `var0` represents command-line arguments (usually named `args`)

---

### 4. Output Statement

```java
System.out.println("Hello World");
```

Prints "Hello World" to the console.

---

## ⚙️ How to Run This Program

### Step 1: Compile

```bash
javac Hello.java
```

### Step 2: Run

```bash
java Hello
```

---

## 🛠️ Requirements

- Java JDK (version 8 or above)
- Terminal / Command Prompt / VS Code

---

## ⚠️ Important Notes

- Decompiled code may include:
  - Different variable names (e.g., `var0` instead of `args`)
  - Extra constructors or formatting changes

- Logic remains the same, but structure may vary

---

## 🎯 Learning Outcome

By exploring this project, you will understand:

- Java compilation (`.java → .class`)
- Basic program structure
- Reverse engineering concepts using decompilers

---

## 🚀 Future Improvements

- Add user input using Scanner
- Convert to OOP-based example
- Explore bytecode using `javap`

---

## 📌 Author

**Priyansh**
Java Developer 🚀
