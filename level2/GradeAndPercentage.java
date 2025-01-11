import java.util.Scanner;
public class GradeAndPercentage{
	public static void main(String[]args){
		//declaring variables 
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students : ");
		number=sc.nextInt();
		int []marks=new int[number];
		double[]percentage=new double[number];
		char[]grades=new char[number];
		//taking input
		int totalmarks=0;
		int p,c,m;
		for(int i=0;i<number;i++){
			System.out.println("For student"+(i+1));
			System.out.print("Enter marks in Math's : ");
			m=sc.nextInt();
			System.out.print("Enter marks in Physics : ");
			p=sc.nextInt();
			System.out.print("Enter marks in Chemistry : ");
			c=sc.nextInt();
			if(p<0||c<0||m<0){
				System.out.println("Enter positive values!");
				i--;
				continue;
			}
			totalmarks=p+c+m;
			marks[i]=totalmarks;
		}
		//computing percentage and grades
		for(int i=0;i<number;i++){
			percentage[i]=marks[i]/3.0;
			if(percentage[i]>=80.0)
				grades[i]='A';
			else if(percentage[i]>=70.0&&percentage[i]<=79.9)
				grades[i]='B';
			else if(percentage[i]>=60.0&&percentage[i]<=69.9)
				grades[i]='C';
			else if(percentage[i]>=50.0&&percentage[i]<=59.9)
				grades[i]='D';
			else if(percentage[i]>=40.0&&percentage[i]<=49.9)
				grades[i]='E';
			else
				grades[i]='R';
		}
		//printing result
		for(int i=0;i<number;i++){
			System.out.println("Student"+(i+1)+"=> marks : "+marks[i]+", percentage : "+percentage[i]+", grade : "+grades[i]);
		}
		//closing sc
		sc.close();
	}
}
			
		