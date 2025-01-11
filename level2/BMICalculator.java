import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int persons = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[persons];
        double[] weight = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        // Taking input for height and weight of each person
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Height input
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();

            // Weight input
            System.out.print("Weight (in kilograms): ");
            weight[i] = sc.nextDouble();

            // computing BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // computing status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
		System.out.println();
        // Displaying results
        System.out.println("BMI Results:");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kilograms");
            System.out.println("BMI: " + bmi[i]); 
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
		//closing sc
        sc.close();
    }
}