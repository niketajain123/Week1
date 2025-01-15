import java.util.Scanner;
public class CountVowelsAndConsonants{
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
	//counting vowels and consonants
	public int[] countVowelConsonant(String string){
		int vowel=0;
		int consonant=0;
		int[]count=new int[2];
		for(int i=0;i<string.length();i++){
			if(identifyChar(string.charAt(i)).equals("Vowel"))
				vowel++;
			else if(identifyChar(string.charAt(i)).equals("Consonant"))
				consonant++;
		}
		count[0]=vowel;
		count[1]=consonant;
		return count;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
		//calling method
		CountVowelsAndConsonants cv=new CountVowelsAndConsonants();
		int[]count=cv.countVowelConsonant(string);
		//displaying output
		System.out.println("Number of vowels in stirng is "+count[0]);
		System.out.println("Number of consonants in stirng is "+count[1]);		
		//closing sc
		sc.close();
	}
}