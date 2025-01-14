import java.util.*;
public class TestNumberFormatException{
	public void generateNumberFormatException(String str){
		
		try{
			int number=Integer.parseInt(str);
		}
		catch(NumberFormatException ex){
			System.out.println("NumberFormatException generated and catched");
		
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		String string=sc.next();
		TestNumberFormatException exc=new TestNumberFormatException();
		exc.generateNumberFormatException(string);
		sc.close();
	}
}
		