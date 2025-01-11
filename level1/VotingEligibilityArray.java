import java.util.Scanner;
public class VotingEligibilityArray{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//defining array of 10 for student's age
		int[]studentAge=new int[10];
		//taking user input using for loop 
		for(int i=0;i<studentAge.length;i++){
			System.out.print("Enter age of student"+(i+1)+" : ");
			studentAge[i]=sc.nextInt();
			}
		//checking age and showing result
		for(int i=0;i<studentAge.length;i++){
			if(studentAge[i]<0)
			System.out.println("Invalid age!"); //invalid age
			else if(studentAge[i]>=18)
			System.out.println("The student"+(i+1)+" with the age "+studentAge[i]+" can vote."); //eligible for voting
			else
			System.out.println("The student"+(i+1)+" with the age "+studentAge[i]+" can not vote."); //not eligible
		}
		//closing scanner object
		sc.close();
	}
}
		