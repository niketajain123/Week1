import java.util.Scanner;
public class MyLength{
	//defining method
	public int myLength(String string){
		int count=0;
		try{
			int i=0;
			while(true){
				string.charAt(i);
				count++;
				i++;
			}
		}
		catch(Exception ex){
			return count;
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string=sc.next();
		//calling method
		MyLength ml=new MyLength();
		int length=ml.myLength(string);
		System.out.println("Length of "+string+" is "+length);
		System.out.println("Is length from myLength() and java's length() same? "+(length==string.length()));
		//closing sc
		sc.close();
	}
}