import java.util.Scanner;
public class MySplit{
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
	//comparing arrays
	public boolean compare(String[]string1,String[]string2){
		if(string1.length!=string2.length)
			return false;
		for(int i=0;i<string1.length;i++){
			if(!string1[i].equals(string2[i]))
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
		//calling methods
		MySplit split=new MySplit();
		String[]splittedString=split.mySplit(string);
		String[]userDefinedSplit=string.split(" ");
		boolean isEqual=split.compare(splittedString,userDefinedSplit);
		//displaying outplut
		for(String str:splittedString){
			System.out.println(str);
		}
		System.out.println("Both splitted string's arrays are same? "+isEqual);

		sc.close();
	}
}
		
			