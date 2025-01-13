import java.util.Scanner;
public class StudentVoteChecker{
	//defining methods
	public boolean canStudentVote(int age){
		if(age>=18)
			return true;
		else
			return false;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		StudentVoteChecker sv=new StudentVoteChecker();
		int[]age=new int[10];
		boolean canVote;
		for(int i=0;i<10;i++){
			System.out.print("Enter age of student"+(i+1)+" : ");
			age[i]=sc.nextInt();
			canVote=sv.canStudentVote(age[i]);
			System.out.println("Student is eligible to vote? "+canVote);
			
		}
		//closing sc
		sc.close();
	}
}
		