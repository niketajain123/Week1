import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for salary and years of service
        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // Check if the employee is eligible for bonus
        double bonus = 0.0;

        if (yearsOfService > 5) {
            // Bonus is 5% of the salary if years of service is more than 5
            bonus = salary * 0.05;
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        sc.close(); // Close the scanner
    }
}
