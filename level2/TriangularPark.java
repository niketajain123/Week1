import java.util.Scanner;
public class TriangularPark{
	public static void main(String[]args){
		//declaring variables
		int side1,side2,side3,perimeter;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter value of first side in meters : ");
		side1=sc.nextInt();
		System.out.println("Enter value of second side in meters : ");
		side2=sc.nextInt();
		System.out.println("Enter value of third side in meters : ");
		side3=sc.nextInt();
		
		//calculating perimeter of triangular park
		perimeter=side1+side2+side3;
		//calculating number of rounds to complete 5km = 5000meter
		int distance=5;
		int rounds=distance*1000/perimeter;
		//printing number of rounds
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete "+ distance+"km");
	}
}
