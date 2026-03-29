package Literals;

public class Literals {
    public static void main(String[] args) {
        // 🔹 Integer Literals
        int decimalLiteral = 100; // Decimal
        int octalLiteral = 0100; // Octal (64 in decimal)
        int hexadecimalLiteral = 0x100; // Hexadecimal (256 in decimal)
        int binaryLiteral = 0b100000000; // Binary (256 in decimal)

        // 🔹 Floating-point Literals
        float floatLiteral = 3.14f; // Float literal
        double doubleLiteral = 3.14159; // Double literal

        // 🔹 Character Literal
        char charLiteral = 'A'; // Character literal

        // 🔹 String Literal
        String stringLiteral = "Hello, World!"; // String literal

        // 🔹 Boolean Literals
        boolean trueLiteral = true; // Boolean literal
        boolean falseLiteral = false; // Boolean literal

        // 🔹 Output
        System.out.println("---- Integer Literals ----");
        System.out.println("Decimal: " + decimalLiteral);
        System.out.println("Octal: " + octalLiteral);
        System.out.println("Hexadecimal: " + hexadecimalLiteral);
        System.out.println("Binary: " + binaryLiteral);

        System.out.println("\n---- Floating-point Literals ----");
        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);

        System.out.println("\n---- Character Literal ----");
        System.out.println("Character: " + charLiteral);

        System.out.println("\n---- String Literal ----");
        System.out.println("String: " + stringLiteral);

        System.out.println("\n---- Boolean Literals ----");
        System.out.println("True: " + trueLiteral);
        System.out.println("False: " + falseLiteral);
    }
}
