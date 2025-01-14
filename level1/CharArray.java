import java.util.*;
public class CharArray{
	//defining method
	public char[] myToCharArray(String string){
		int length=string.length();
		char[]charArray=new char[length];
		for(int i=0;i<length;i++){
			charArray[i]=string.charAt(i);
		}
		return charArray;
	}
	public boolean compare(char[]charArray1,char[]charArray2){
		if(charArray1.length!=charArray2.length)
			return false;
		for(int i=0;i<charArray1.length;i++){
			if(charArray1[i]!=charArray2[i])
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter string : ");
		String string=sc.next();
		//calling method
		CharArray ca=new CharArray();
		char[]array1=ca.myToCharArray(string);
		char[]array2=string.toCharArray();
		//comparing two arrays
		boolean result=ca.compare(array1,array2);
		System.out.println("myCharArray is : "+Arrays.toString(array1));
		System.out.println("charArray is : "+Arrays.toString(array2));
		System.out.println("Both charArrays are same? "+result);
		//closing sc
		sc.close();
	}
}