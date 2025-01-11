import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Iterate from 1 to the user-entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd and print the result
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        sc.close(); // Close the scanner
    }
}
