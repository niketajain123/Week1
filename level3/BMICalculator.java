import java.util.Scanner;

public class BMICalculator{

    // compute BMI
    public String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = (float)data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100.0; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI
            String status;
			if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store height, weight, BMI, and status
            result[i][0] = String.valueOf(heightInCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

     public static void displayTable(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }


    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for height and weight
        double[][] heightWeightData = new double[10][2]; 

        System.out.println("Enter weight (in kg) and height (in cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            heightWeightData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            heightWeightData[i][1] = sc.nextDouble();
        }
        BMICalculator bmi=new BMICalculator();
        String[][] bmiData = bmi.computeBMI(heightWeightData);

        // Display the BMI table
        bmi.displayTable(bmiData);
		//closing sc
        sc.close();
    }
}
