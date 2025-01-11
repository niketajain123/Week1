import java.util.Scanner;
public class CheckBMI{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring weight and height variable
		double weight,heightInCm,heightInM,BMI;
		//taking input from user
		System.out.println("Enter weight : ");
		weight=sc.nextInt();
		System.out.println("Enter height in cm : ");
		heightInCm=sc.nextInt();
		
		//convert height into meters
		heightInM=100*heightInCm;
		//calculating BMI
		BMI=weight/(heightInM*heightInM);
		//checking and printing BMI
		if(BMI<=18.4){
			System.out.println("Underweight!");
		}
		else if(BMI>=18.5&&BMI<=24.9){
			System.out.println("Normal!");
		}
		else if(BMI>=25.0&&BMI<=39.9){
			System.out.println("Overweight!");
		}
		else if(BMI>=40.0){
			System.out.println("Obese!");
		}
		//closing sc object
		sc.close();
	}
}
		