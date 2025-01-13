import java.util.Scanner;
public class TriangularPark{
	//defining method
	public int rounds(int side1,int side2,int side3){
		int perimeter=side1+side2+side3; //in meter
		int length=5; //in km
		int round=length*1000/perimeter;
		return round;
	}
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter length of side1 (in meters) : ");
		int side1=sc.nextInt();
		System.out.print("Enter length of side2 (in meters) : ");
		int side2=sc.nextInt();
		System.out.print("Enter length of side3 (in meters) : ");
		int side3=sc.nextInt();
		//calling method
		TriangularPark tp=new TriangularPark();
		int round=tp.rounds(side1,side2,side3);
		//printing result
		System.out.println("To complete 5km run "+round+" rounds must be completed.");
		//closing sc
		sc.close();
	}
}
		
		