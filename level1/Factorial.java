import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take the input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is valid
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize variables
            int factorial = 1;
            int counter = number;

            // Calculate factorial using a while loop
            while (counter > 0) {
                factorial *= counter; // Multiply current value of counter
                counter--;           // Decrement counter
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        sc.close(); // Close the scanner
    }
}
