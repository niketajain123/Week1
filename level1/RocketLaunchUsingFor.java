import java.util.Scanner;

public class RocketLaunchUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the starting value for the countdown
        System.out.print("Enter the countdown starting number: ");
        int startNumber = sc.nextInt();

        System.out.println("Starting the countdown...");

        // For loop for countdown
        for (int counter = startNumber; counter >= 1; counter--) {
            System.out.println(counter); // Print the current countdown value
        }

        // Launch message
        System.out.println("Rocket has launched!");
        
        sc.close(); // Close the scanner
    }
}
