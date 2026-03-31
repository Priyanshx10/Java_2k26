package NarrowingPrimitiveConversion;

public class Conversion {

    public static void main(String[] args) {

        System.out.println("===== 1. NO OVERFLOW =====");
        noOverflowExample();

        System.out.println("\n===== 2. POSITIVE OVERFLOW =====");
        positiveOverflowExample();

        System.out.println("\n===== 3. LARGE VALUE OVERFLOW =====");
        largeValueOverflowExample();

        System.out.println("\n===== 4. NEGATIVE OVERFLOW =====");
        negativeOverflowExample();

        System.out.println("\n===== 5. REAL-WORLD BUG =====");
        realWorldBugExample();

        System.out.println("\n===== 6. SAFE CONVERSION =====");
        safeConversionExample();
    }

    // ✅ 1. No Overflow
    public static void noOverflowExample() {
        int num = 50;
        byte b = (byte) num;

        System.out.println("Original int: " + num);
        System.out.println("Converted byte: " + b);
    }

    // ❌ 2. Positive Overflow
    public static void positiveOverflowExample() {
        int num = 130;
        byte b = (byte) num;

        System.out.println("Original int: " + num);
        System.out.println("Converted byte: " + b);
        System.out.println("Explanation: 130 - 256 = -126");
    }

    // ❌ 3. Large Value Overflow
    public static void largeValueOverflowExample() {
        int num = 300;
        byte b = (byte) num;

        System.out.println("Original int: " + num);
        System.out.println("Converted byte: " + b);
        System.out.println("Explanation: 300 % 256 = 44");
    }

    // ❌ 4. Negative Overflow
    public static void negativeOverflowExample() {
        int num = -130;
        byte b = (byte) num;

        System.out.println("Original int: " + num);
        System.out.println("Converted byte: " + b);
        System.out.println("Explanation: -130 + 256 = 126");
    }

    // ⚠️ 5. Real-World Bug Scenario
    public static void realWorldBugExample() {
        int salary = 1000;
        byte stored = (byte) salary;

        System.out.println("Original salary: " + salary);
        System.out.println("Stored in byte (WRONG): " + stored);
        System.out.println("⚠️ Data loss occurred!");
    }

    // ✅ 6. Safe Conversion
    public static void safeConversionExample() {
        int num = 127;

        if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
            byte b = (byte) num;
            System.out.println("Safe conversion: " + b);
        } else {
            System.out.println("❌ Cannot safely convert " + num + " to byte");
        }
    }
}