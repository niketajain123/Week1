import java.util.Scanner;
public class YoungestFriend{
	//defining methods
	public int youngest(int []friends){
		if(friends[0]<friends[1]&&friends[0]<friends[2])
			return 0;
		else if(friends[1]<friends[0]&&friends[1]<friends[2])
			return 1;
		else
			return 2;
	}
	public int tallest(int []friends){
		if(friends[0]>friends[1]&&friends[0]>friends[2])
			return 0;
		else if(friends[1]>friends[0]&&friends[1]>friends[2])
			return 1;
		else
			return 2;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int[]age=new int[3];
		int[]height=new int[3];
		String[]friends={"Amar","Akbar","Anthony"};
		//taking input
		for(int i=0;i<3;i++){
			System.out.print("Enter "+friends[i]+"'s age : ");
			age[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.print("Enter "+friends[i]+"'s height : ");
			height[i]=sc.nextInt();
		}
		
		YoungestFriend yf=new YoungestFriend();
		int youngest=yf.youngest(age);
		int tallest=yf.tallest(height);
		System.out.println("Youngest amongst three is "+friends[youngest]);
		System.out.println("Tallest amongst three is "+friends[tallest]);
		
		//closing sc
		sc.close();
	}
}
		