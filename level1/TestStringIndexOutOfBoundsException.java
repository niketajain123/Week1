import java.util.*;
public class TestStringIndexOutOfBoundsException{
	public void generateStringIndexOutOfBoundsException(String str){
		int length =str.length();
		try{
			char ch=str.charAt(length+1);
		}
		catch(StringIndexOutOfBoundsException ex){
			System.out.println("StringIndexOutOFBOundsException generated and catched");
		
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String string=sc.next();
		TestStringIndexOutOfBoundsException exc=new TestStringIndexOutOfBoundsException();
		exc.generateStringIndexOutOfBoundsException(string);
		sc.close();
	}
}
		