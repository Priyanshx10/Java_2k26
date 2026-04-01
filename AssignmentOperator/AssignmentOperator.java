public class AssignmentOperatorDemo {
    public static void main(String[] args) {

        int a = 10;

        // Basic Assignment
        System.out.println("Initial: " + a);

        // Addition
        a += 5;
        System.out.println("After += 5: " + a);

        // Subtraction
        a -= 3;
        System.out.println("After -= 3: " + a);

        // Multiplication
        a *= 2;
        System.out.println("After *= 2: " + a);

        // Division
        a /= 4;
        System.out.println("After /= 4: " + a);

        // Modulus
        a %= 3;
        System.out.println("After %= 3: " + a);

        // Bitwise
        a = 5;
        a &= 3;
        System.out.println("After &= 3: " + a);

        a |= 2;
        System.out.println("After |= 2: " + a);

        a ^= 1;
        System.out.println("After ^= 1: " + a);

        // Shift
        a <<= 1;
        System.out.println("After <<= 1: " + a);

        a >>= 1;
        System.out.println("After >>= 1: " + a);

        // Byte Example (Casting Behavior)
        byte b = 10;
        b += 5; // Works
        System.out.println("Byte after += 5: " + b);
    }
}
