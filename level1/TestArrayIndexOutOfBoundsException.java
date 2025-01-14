import java.util.*;
public class TestArrayIndexOutOfBoundsException{
	public void generateArrayIndexOutOfBoundsException(String[]persons){
		int length =persons.length;
		try{
			persons[length].length();
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndexOutOFBOundsException generated and catched");
		
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of persons : ");
		int number=sc.nextInt();
		String[]persons=new String[number];
		for(int i=0;i<number;i++){
		System.out.print("Enter name of person"+(i+1)+" : ");
		persons[i]=sc.next();
		}
		TestArrayIndexOutOfBoundsException exc=new TestArrayIndexOutOfBoundsException();
		exc.generateArrayIndexOutOfBoundsException(persons);
		sc.close();
	}
}
		