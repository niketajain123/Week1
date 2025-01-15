import java.util.Scanner;
public class IdentifyVowelConsonantIn2DArray{
	//defining method
	//identifying character
	public String identifyChar(char ch){
		if(ch>='A'&&ch<='Z')
			ch=(char)(ch+32);
		if(ch>='a'&&ch<='z'){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				return  "Vowel";
			else
				return "Consonant";
			}
			return "Not a Letter";	
	}
	//assigning vowels and consonants
	public String[][] vowelAndConsonant(String string){
		String[][]charInfo=new String[string.length()][2];
		String info="";
		for(int i=0;i<string.length();i++){
			info=identifyChar(string.charAt(i));
			charInfo[i][0]=String.valueOf(string.charAt(i));
			charInfo[i][1]=info;
		}
		return charInfo;
	}
	//printing 2D array
	public void print(String[][] charInfo){
		for(int i=0;i<charInfo.length;i++){
			System.out.println(charInfo[i][0]+"\t\t"+charInfo[i][1]);
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
		//calling method
		IdentifyVowelConsonantIn2DArray cv=new IdentifyVowelConsonantIn2DArray();
		String[][]charInfo=cv.vowelAndConsonant(string);
		System.out.println("Character\tInformation");
		cv.print(charInfo);
		
		//closing sc
		sc.close();
	}
}