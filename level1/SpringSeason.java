import java.util.Scanner;
public class SpringSeason{
	//defining method
	public boolean isSpringSeason(int month,int day){
		boolean result;
		if((month==3 &&(day>=20&&day<=31))||
		   (month==4 &&(day>=1&&day<=30))||
		   (month==5 &&(day>=1&&day<=31))||
		   (month==6 &&(day>=1&&day<=20)))
		    result=true;
		else
			result =false;
		return result;
	}
	//main() method
	public static void main(String[]args){
		//taking input from command-line argument
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		//calling method
		SpringSeason ss=new SpringSeason();
		boolean isSpring=ss.isSpringSeason(month,day);
		//printing result
		System.out.println(day+"/"+month+" is spring season? "+isSpring);		
	}
}
		
		