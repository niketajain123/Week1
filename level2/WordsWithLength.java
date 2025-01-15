import java.util.Scanner;
public class WordsWithLength{
	public int myLength(String string){
		int count=0;
		try{
			int i=0;
			while(true){
				string.charAt(i);
				count++;
				i++;
			}
		}
		catch(Exception ex){
			return count;
		}
	}
	public String[] mySplit(String string){
		int countSpace=0;
		for(int i=0;i<myLength(string);i++){
			if(string.charAt(i)==' ')
				countSpace++;
		}
		String[]splittedString=new String[countSpace+1];
		int index=0;
		String word="";
		for(int i=0;i<myLength(string);i++){
			if(string.charAt(i)==' '){
				splittedString[index]=word;
				word="";
				index++;
			}
			else{
				word+=string.charAt(i);
			}
		}
		splittedString[index]=word;
		return splittedString;
	}
	public String[][] wordsWithLength(String[]stringArray){
		String[][]stringWithLength=new String[stringArray.length][2];
		for(int i=0;i<stringArray.length;i++){
			stringWithLength[i][0]=stringArray[i];
			int lengthOfWord=myLength(stringArray[i]);
			stringWithLength[i][1]=String.valueOf(lengthOfWord);
		}
		return stringWithLength;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
		WordsWithLength wl=new WordsWithLength();
		String[]splittedString=wl.mySplit(string);
		String[][]wordsWithLength=wl.wordsWithLength(splittedString);
		System.out.println("WORD\tLENGTH");
		for(String[] wordAndLength:wordsWithLength){
			for(String str:wordAndLength){
				System.out.print(str+"\t");
			}
			System.out.println();
		}
		//closing sc
		sc.close();
	}
}
		
			