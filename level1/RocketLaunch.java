import java.util.Scanner;

public class RocketLaunch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the starting value for the countdown
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        System.out.println("Starting the countdown...");

        // While loop for countdown
        while (counter >= 1) {
            System.out.println(counter); // Print the current countdown value
            counter--; // Decrement the counter
        }

        // Launch message
        System.out.println("Rocket launched!");
        
        sc.close(); // Close the scanner
    }
}
