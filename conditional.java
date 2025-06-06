public class conditional  {
    public static void main(String[] args) {
        int number = 10;

        // If-Else Statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Statement
        switch (number) {
            case 1:
                System.out.println("Number is one.");
                break;
            case 10:
                System.out.println("Number is ten.");
                break;
            default:
                System.out.println("Number is neither one nor ten.");
                break;
        }
    }
}
