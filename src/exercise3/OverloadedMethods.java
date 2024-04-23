package exercise3;

public class OverloadedMethods {

    // Method 1: Adds two integers and returns their sum.
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method 2: Adds two doubles and returns their sum.
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    // Method 3: Adds three integers and returns their sum.
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        // Calling Method 1 and displaying the result.
        int result1 = sum(4, 12);
        System.out.println("Result of Method 1: " + result1);

        // Calling Method 2 and displaying the result.
        double result2 = sum(5.5, 7.7);
        System.out.println("Result of Method 2: " + result2);

        // Calling Method 3 and displaying the result.
        int result3 = sum(4, 5, 6);
        System.out.println("Result of Method 3: " + result3);
    }
}
