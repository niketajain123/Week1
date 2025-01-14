import java.util.Scanner;

public class TestIllegalArgumentException{
	public void generateIllegalArgumentException(String str,int start, int end){
		try{
			if(start>end)
				throw new IllegalArgumentException();
			String sub=str.substring(start,end);
		}
		catch(IllegalArgumentException ex){
			System.out.println("IllegalArgumentException generated and catched");
		
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String string=sc.next();
		System.out.println("Enter start and end index : ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		TestIllegalArgumentException exc=new TestIllegalArgumentException();
		exc.generateIllegalArgumentException(string,start,end);
		sc.close();
	}
}
		