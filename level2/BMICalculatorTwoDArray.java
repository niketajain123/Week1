import java.util.Scanner;

public class BMICalculatorTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int persons = sc.nextInt();

        // 2d array to store person's information
        double[][] personData = new double[persons][3]; 
        String[] weightStatus = new String[persons]; 

        // Taking input for height and weight
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Height (in meters): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Weight (in kilograms): ");
            personData[i][1] = sc.nextDouble();

            // Computing BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining the weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Printing results
       
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kilograms");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}