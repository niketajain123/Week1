import java.util.*;
public class HandShake{
	public static void main(String[]args){
		//create variable for number of students
		int numberOfStudents;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in numberOfStudents using Scanner Object
		System.out.println("Enter number of students : ");
		numberOfStudents=sc.nextInt();
		//create variables for total handshakes
		int handshakes;
		//logic used for handshakes=>n*(n-1)/2;  
		handshakes=numberOfStudents*(numberOfStudents-1)/2;
		//printing the total handshakes
		System.out.println(" The total number of handshakes is "+handshakes );
	}
}