import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Initialize total to 0
        double userInput;  // Variable to store user input

        System.out.println("Enter positive numbers to add to the total (enter 0 or a negative number to stop):");

        // Infinite loop
        while (true) {
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble(); // Get user input

            // Check if the input is 0 or negative to break the loop
            if (userInput <= 0) {
                break;
            }

            total += userInput; // Add input to total
        }

        // Display the total after the loop
        System.out.println("The total sum is: " + total);

        sc.close(); // Close the scanner
    }
}
