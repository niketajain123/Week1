import java.util.*;
public class DayOfWeek{
	public static void main(String[]args){
		//taking input from command-line arguments
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		/*	y0 = y − (14 − m) / 12	
			x = y0 + y0/4 − y0/100 + y0/400
			m0 = m + 12 × ((14 − m) / 12) − 2
			d0 = (d + x + 31m0 / 12) mod 7
		*/
		//declaring variables
		int y0,m0,d0,x; //for adjusting days, months,and year 
		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=m+12*((14-m)/12)-2;
		d0=(d+x+31*m0/12)%7;
		//printing the result
		System.out.println("On the date ("+d+"/"+m+"/"+y+") the day is "+d0);
}
}