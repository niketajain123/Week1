import java.util.Scanner;
public class ToUpperCase{
	public String myToUpperCase(String string){
		String upperCase="";
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)>='a'&&string.charAt(i)<='z')
				upperCase+=(char)(string.charAt(i)-32);
			else
				upperCase+=string.charAt(i);
		}
		return upperCase;
	}
	public boolean compare(String str1,String str2){
		if(str1.length()!=str2.length())
			return false;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking string input
		System.out.print("Enter a string : ");
		String original=sc.nextLine();
		//calling method
		ToUpperCase uc=new ToUpperCase();
		String myUpperCase=uc.myToUpperCase(original);
		String upperCase=original.toUpperCase();
		boolean result=uc.compare(myUpperCase,upperCase);
		//displaying results
		System.out.println("UpperCase using myToUpperCase() => "+myUpperCase);
		System.out.println("UpperCase using toUpperCase() => "+upperCase);
		System.out.println("Both uppercase strings are same? "+result);
		//closing sc
		sc.close();
	}
}
		
		