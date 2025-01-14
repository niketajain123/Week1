import java.util.Scanner;
public class ToLowerCase{
	public String myToLowerCase(String string){
		String lowerCase="";
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)>='A'&&string.charAt(i)<='Z')
				lowerCase+=(char)(string.charAt(i)+32);
			else
				lowerCase+=string.charAt(i);
		}
		return lowerCase;
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
		ToLowerCase uc=new ToLowerCase();
		String myLowerCase=uc.myToLowerCase(original);
		String lowerCase=original.toLowerCase();
		boolean result=uc.compare(myLowerCase,lowerCase);
		//displaying results
		System.out.println("LowerCase using myToLowerCase() => "+myLowerCase);
		System.out.println("LowerCase using toLowerCase() => "+lowerCase);
		System.out.println("Both lowercase strings are same? "+result);
		//closing sc
		sc.close();
	}
}
		
		