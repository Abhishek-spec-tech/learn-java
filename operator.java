public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational Operators
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        System.out.println("a is equal to b: " + (a == b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
    }
}
