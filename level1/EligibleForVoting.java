import java.util.Scanner;

public class EligibleForVoting {
    public static void main(String[] args) {
		//creating object of scanner for taking input
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
