import java.util.*;
public class AreaOfTriangle{
	public static void main(String[]args){
		//create variables for base and height  
		int base,height;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in base and height using Scanner Object
		System.out.println("Enter base in centimeters : ");
		base=sc.nextInt();
		System.out.println("Enter height in centimeters : ");
		height=sc.nextInt();
		//create variables for area in cm and inches
		double areaOfTriangleInCM,areaOfTriangleInInches;
		//logic used for area of triangle=>1/2*base*height  
		areaOfTriangleInCM=(double)1/2*base*height;
		//logic used for area of triangle in inches=>cm*1/2.54  
		areaOfTriangleInInches=areaOfTriangleInCM*1/2.54;
		
		//printing the area in cm,and inches
		System.out.println("Area in cm is "+areaOfTriangleInCM+" while in inches is "+areaOfTriangleInInches);
	}
}