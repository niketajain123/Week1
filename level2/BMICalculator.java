import java.util.Scanner;

public class BMICalculator {
	public void bmiCalculator(double[][]persons){
		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				// computing BMI
            persons[i][2] = persons[i][0] / (persons[i][1]/100 * persons[i][1]/100);
			}
		}
	}
	public String[] bmiStatus(double[][]bmi){
		String[]status=new String[10];
		for(int i=0;i<10;i++){
			if(bmi[i][2]<=18.4)
				status[i]="Underweight";
			else if(bmi[i][2]>=18.5&&bmi[i][2]<=24.9)
				status[i]="Normal";
			else if(bmi[i][2]>=25.0&&bmi[i][2]<=39.9)
				status[i]="Overweight";
			else
				status[i]="Obese";
		}
		return status;
	}
			
				
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Arrays to store height, weight, BMI, and weight 
        double[][]persons=new double[10][3];
        // Taking input for height and weight of each person
        for (int i = 0; i <10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
           
			// Weight input
            System.out.print("Weight (in kilograms): ");
            persons[i][0] = sc.nextDouble();            
            // Height input
            System.out.print("Height (in cm): ");
            persons[i][1] = sc.nextDouble();            
			}
		
           BMICalculator bmi=new BMICalculator();
		   bmi.bmiCalculator(persons);
		   String[]status=bmi.bmiStatus(persons);
		System.out.println();
        // Displaying results
        System.out.println("BMI Results:");
        for (int i = 0; i <10; i++) {
			
            System.out.println("Person " + (i + 1) + ":");
			System.out.println("Weight: " + persons[i][0] + " kilograms");
            System.out.print("Height: " + persons[i][1] + " centimeters");
            System.out.println("BMI: " + persons[i][2]); 
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
		//closing sc
        sc.close();
    }
}
