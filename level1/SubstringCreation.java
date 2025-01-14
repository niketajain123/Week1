import java.util.Scanner;
public class SubstringCreation{
	//defining method
	public String mySubstring(String string, int start, int end){
		String substring="";
		for(int i=start;i<end;i++){
			substring+=string.charAt(i);
		}
		return substring;
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
		System.out.print("Enter string : ");
		String string=sc.next();
		System.out.print("Enter start index : ");
		int start=sc.nextInt();
		System.out.print("Enter end index : ");
		int end=sc.nextInt();
		SubstringCreation sub=new SubstringCreation();
		//substring by user-defined method
		String mysubstring=sub.mySubstring(string,start,end);
		//substring by built-in method
		String builtInSubstring=string.substring(start,end);
		//comparing substrings
		boolean result=sub.compare(mysubstring,builtInSubstring);
		System.out.println("Substring from user defined method => "+mysubstring);
		System.out.println("Substring from built-in method => "+builtInSubstring);
		System.out.println("Both the strings are same? "+result);
		
		//closing sc
		sc.close();
	}
}