import java.util.Scanner;
public class ThreeFriends{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		int ages[]=new int[3];
		int heights[]=new int[3];
		String youngest,tallest;
		 int ageIndex=0,heightIndex=0;
		 //taking input
		 for(int i=0;i<3;i++)
		 {
			 System.out.println("Enter age of friend"+(i+1)+" : ");
			 ages[i]=sc.nextInt();
		 }
		 for(int i=0;i<3;i++)
		 {
			 System.out.println("Enter height of friend"+(i+1)+" : ");
			 heights[i]=sc.nextInt();
		 }
		 int minAge=ages[0];
		 int maxHeight=heights[0];
		 //finding
		 for(int i=0;i<3;i++){
			if(minAge>ages[i]){
			minAge=ages[i];
			ageIndex=i;
			}		 
		 }
		 for(int i=0;i<3;i++){
			if(maxHeight<heights[i]){
			maxHeight=heights[i];
			heightIndex=i;
			}		 
		 }
		 if(ageIndex==0)
			 youngest="Amar";
		 else if(ageIndex==1)
			 youngest="Akbar";
		 else
			 youngest="Anthony";
		 
		  if(heightIndex==0)
			 tallest="Amar";
		 else if(heightIndex==1)
			 tallest="Akbar";
		 else
			tallest="Anthony";	
		//printing
		 System.out.println("Youngest is "+youngest);
		 System.out.println("Tallest is "+tallest);	
		
		//closing sc object
		sc.close();
	}
}
		