public class recursion {
    public static void main(String[] args) {
        // Call 1 - Factorial using recursion
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        // Call 2 - Fibonacci series using recursion
        int n = 10;
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Function to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive call
    }

    // Function to calculate Fibonacci series using recursion
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        } else if (n == 1) {
            return 1; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }
}
