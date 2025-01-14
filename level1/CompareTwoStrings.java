import java.util.Scanner;
public class CompareTwoStrings{
	//defining method
	public boolean myEquals(String string1,String string2){
		if(string1.length()!=string2.length())
			return false;
		for(int i=0;i<string1.length();i++){
			if(string1.charAt(i)!=string2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string1 : ");
		String string1=sc.next();
		System.out.print("Enter string2 : ");
		String string2=sc.next();
		CompareTwoStrings cs=new CompareTwoStrings();
		//comparing strings by user-defined method
		boolean myequals=cs.myEquals(string1,string2);
		//comparing strings by built-in method
		boolean equals=string1.equals(string2);
		if(equals==myequals)
		System.out.println("Result from both methods is same.");
		else
		System.out.println("Result from both methods is not same.");
		System.out.println("using myEqual() method => Strings are same "+myequals);
		System.out.println("using equals() method => Strings are same "+equals);
		
		//closing sc
		sc.close();
	}
}