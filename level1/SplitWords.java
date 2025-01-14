import java.util.*;
public class SplitWords{
	public String[] mySplit(String string){
		int count=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==' ')
				count++;
		}
		String[]words=new String[count+1];
		String word="";
		int i,j=0;
		for( i=0,j=0;i<string.length()&&j<=count;i++){
			if(string.charAt(i)==' '){
				words[j]=word;
				j++;
				word="";
			}
			else
			word+=string.charAt(i);
		}
		words[j]=word;
		return words;
	}
	public static int myLength(String string){
		int length=0;
		char[]charArray=string.toCharArray();
		for(char ch:charArray){
			length++;
		}
		return length;
	}
	public String[][] wordWithLength(String[]words){
		String[][]wordAndLength=new String[words.length][2];
		for(int i=0;i<words.length;i++){
			wordAndLength[i][0]=words[i];
			wordAndLength[i][1]=String.valueOf(myLength(words[i]));
		}
		return wordAndLength;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String string=sc.nextLine();
		SplitWords sw=new SplitWords();
		String[]words=sw.mySplit(string);
		String[][]wordsWithTheirLength=sw.wordWithLength(words);
		System.out.println("Words and their length : ");
		for(int i=0;i<wordsWithTheirLength.length;i++){
			System.out.println(wordsWithTheirLength[i][0]+"\t"+wordsWithTheirLength[i][1]);
		}
		//closing sc
		sc.close();
	}
}