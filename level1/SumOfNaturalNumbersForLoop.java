import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Verify and compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("There is a differencea between the computations.");
            }
        }

        sc.close(); // Close the scanner
    }
}
