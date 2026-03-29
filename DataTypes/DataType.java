package DataTypes;

public class DataType {
    public static void main(String[] args) {

        // 🔹 Primitive Data Types
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;

        float floatValue = 10.5f;
        double doubleValue = 20.99;

        char charValue = 'A';
        boolean booleanValue = true;

        // 🔹 Non-Primitive Data Types
        String name = "Priyansh";
        int[] numbers = {1, 2, 3, 4, 5};

        // 🔹 Output
        System.out.println("---- Primitive Data Types ----");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\n---- Non-Primitive Data Types ----");
        System.out.println("String: " + name);

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}