public class function {
      // 1️⃣ Simple function with no parameters and no return type
    public static void sayHello() {
        System.out.println("Hello, Duniya!");
    }

    // 2️⃣ Function with parameters but no return
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3️⃣ Function with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // 4️⃣ Function to check if number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 5️⃣ Function to find factorial (using loop)
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 6️⃣ Function with no input but with return
    public static String getMessage() {
        return "Yeh message function se aaya hai.";
    }

    // 🔚 main function - entry point of program
    public static void main(String[] args) {

        // Call 1 - Simple hello function
        sayHello();

        // Call 2 - Greet with name
        greet("Abhishek");
        greet("Ravi");

        // Call 3 - Add two numbers
        int sum = add(15, 20);
        System.out.println("Sum = " + sum);

        // Call 4 - Even/Odd checker
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // Call 5 - Factorial of number
        int f = factorial(5);
        System.out.println("Factorial of 5 is: " + f);

        // Call 6 - Message function
        String msg = getMessage();
        System.out.println(msg);
    }
}
