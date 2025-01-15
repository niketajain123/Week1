import java.util.*;

public class VotingEligibility {

    // Method to generate random 2-digit age
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; 
		}
        return ages;
    }

    // voting eligibility and validate age
    public static String[][] determineEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); 
            if (ages[i] < 0) {
                results[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                results[i][1] = "true"; 
            } else {
                results[i][1] = "false"; 
            }
        }
        return results;
    }

    // display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // taking input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
		int[] ages = generateRandomAges(n);
		String[][] results = determineEligibility(ages);
        // Display results
        displayResults(results);
		//closing sc
		sc.close();
    }
}