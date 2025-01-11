import java.util.Scanner;

public class MarksCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//declaring variables
		char grade;
		String remark;
        // Take input from the user
        System.out.print("Enter marks in maths: ");
        int maths = sc.nextInt();
		System.out.print("Enter marks in physics: ");
        int physics = sc.nextInt();
		System.out.print("Enter marks in chemistry: ");
        int chemistry = sc.nextInt();
		//computing percentage
		double percentage=(double)(maths+physics+chemistry)/3;
        //computing grades and printing output
		if(percentage>=80){
			grade='A';
			remark="Level 4, above agecy-normalized standars";
		}
		else if(percentage>=70&&percentage<=79){
			grade='B';
			remark="Level 3, at agecy-normalized standars";
		}
		else if(percentage>=60&&percentage<=69){
			grade='C';
			remark="Level 2, below, but approaching agecy-normalized standars";
		}
		else if(percentage>=50&&percentage<=59){
			grade='D';
			remark="Level 1, well below agecy-normalized standars";
		}
		else if(percentage>=40&&percentage<=49){
			grade='E';
			remark="Level 1, too agecy-normalized standars";
		}
		else {
			grade='R';
			remark="Remedial standars";
		}
		System.out.println("Average marks are "+percentage+", Grade is "+grade+" and remark is "+remark);
		sc.close(); // Close the scanner
    }
}
