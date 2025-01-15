import java.util.Scanner;
public class ShortestAndLongestString{
	//computing length
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
	//splitting string
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
	//storing words with length
	public String[][] wordsWithLength(String[]stringArray){
		String[][]stringWithLength=new String[stringArray.length][2];
		for(int i=0;i<stringArray.length;i++){
			stringWithLength[i][0]=stringArray[i];
			int lengthOfWord=myLength(stringArray[i]);
			stringWithLength[i][1]=String.valueOf(lengthOfWord);
		}
		return stringWithLength;
	}
	//finding shortest and longest length
	public int[] shortestAndLongest(String[][]wordsWithLength){
		int[]lengthArray=new int[2];
		int firstLength=Integer.parseInt(wordsWithLength[0][1]);
		int longest=firstLength;
		int shortest=firstLength;
		for(int i=0;i<wordsWithLength.length;i++){
			int ln=Integer.parseInt(wordsWithLength[i][1]);
			if(longest<ln)
				longest=ln;
			if(shortest>ln)
				shortest=ln;
		}
			lengthArray[0]=longest;
			lengthArray[1]=shortest;
			return lengthArray;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
		ShortestAndLongestString sl=new ShortestAndLongestString();
		String[]splittedString=sl.mySplit(string);
		String[][]wordsWithLength=sl.wordsWithLength(splittedString);
		//displaying output
		System.out.println("WORD\tLENGTH");
		for(String[] wordAndLength:wordsWithLength){
			for(String str:wordAndLength){
				System.out.print(str+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		int[]lengths=sl.shortestAndLongest(wordsWithLength);
		System.out.println("Longest length is : "+lengths[0]);
		System.out.println("Shortest length is : "+lengths[1]);		
		//closing sc
		sc.close();
	}
}
		
			