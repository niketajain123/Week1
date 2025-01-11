import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Initialize total to 0
        double userInput;  // Variable to store user input

        System.out.println("Enter numbers to add to the total (enter 0 to stop):");

        // Loop to keep adding numbers until user enters 0
        while (true) {
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble(); // Get user input
            
            if (userInput == 0) {
                break; // Exit the loop if user enters 0
            }
            
            total += userInput; // Add input to total
        }

        // Display the total after the loop
        System.out.println("The total sum is: " + total);

        sc.close(); // Close the scanner
    }
}
