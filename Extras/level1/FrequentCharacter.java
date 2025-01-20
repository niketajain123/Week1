import java.util.Scanner;

public class FrequentCharacter {
    //Create a method to find out the most Frequent character
    public static char mostFrequentCharacter(String str){
           String string =str.toLowerCase();
           int max =0; int index=0;
           int mostFrequent[]=new int[26];
           for(int i=0;i<string.length();i++){
               mostFrequent[string.charAt(i)-'a']++;
           }
       //find max Frequency of a character
        for(int i=0 ;i<26;i++){
           if(max<=mostFrequent[i]){
               max = mostFrequent[i];
               index=i;
           }
        }
        char result =(char)(index+'a');
        return result;
    }
//main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        char mostFrequentCharacter=mostFrequentCharacter(str);
        System.out.println("The Most Frequent Character is : "+mostFrequentCharacter);
    }
}
