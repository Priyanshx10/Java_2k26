package TypeConversion;
public class TypeConversion {
    public static void main(String[] args) {

        // 1. Implicit Conversion
        int intVal = 50;
        double doubleVal = intVal; // automatic

        // 2. Explicit Conversion
        double d = 45.67;
        int i = (int) d; // manual casting

        // 3. Arithmetic Conversion
        int a = 10;
        double b = 20.5;
        double result = a + b;

        // 4. String to Number
        String str = "200";
        int num = Integer.parseInt(str);

        // 5. Number to String
        int number = 500;
        String text = String.valueOf(number);

        System.out.println("Implicit: " + doubleVal);
        System.out.println("Explicit: " + i);
        System.out.println("Arithmetic: " + result);
        System.out.println("String to Int: " + num);
        System.out.println("Int to String: " + text);
    }
}