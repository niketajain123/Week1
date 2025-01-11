import java.util.Scanner;
public class YoungestFriend{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring ages and heights of three friends
		int amarAge,akbarAge,anthonyAge,amarHeight,akbarHeight,anthonyHeight;
		//taking input from user
		System.out.println("Enter Amar's age and height : ");
		amarAge=sc.nextInt();
		amarHeight=sc.nextInt();
		System.out.println("Enter Akbar's age and height : ");
		akbarAge=sc.nextInt();
		akbarHeight=sc.nextInt();
		System.out.println("Enter Anthony's age and height : ");
		anthonyAge=sc.nextInt();
		anthonyHeight=sc.nextInt();
		
		//youngest
		if(amarAge<akbarAge&&amarAge<anthonyAge){
			System.out.println("Amar is youngest!");
		}
		else if(akbarAge<amarAge&&akbarAge<anthonyAge){
			System.out.println("Akbar is youngest!");
		}
		else if(anthonyAge<amarAge&&anthonyAge<akbarAge){
			System.out.println("Anthony is youngest!");
		}
		//smallest height
		if(amarHeight<akbarHeight&&amarHeight<anthonyHeight){
			System.out.println("Amar is smallest!");
		}
		else if(akbarHeight<amarHeight&&akbarAge<anthonyHeight){
			System.out.println("Akbar is smallest!");
		}
		else if(anthonyHeight<amarHeight&&anthonyHeight<akbarHeight){
			System.out.println("Anthony is smallest!");
		}	
		
		//closing sc object
		sc.close();
	}
}
		