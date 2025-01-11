import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take the input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is valid
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial
            int factorial = 1;

            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current value of i
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        sc.close(); // Close the scanner
    }
}
