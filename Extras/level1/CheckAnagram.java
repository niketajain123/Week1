import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckAnagram {

    public static boolean isAnagram(String string1,String string2){
        string1= string1.toLowerCase();
        string2=string2.toLowerCase();

        if(string1.length()!=string2.length()){
            return false;
        }else{
            char ch1[]= string1.toCharArray();
            char ch2[]= string2.toCharArray();

            for (int i = 0; i <ch1.length ; i++) {
                if (ch1[i]!=ch2[i])return false;
                else if((ch1[i]==ch2[i])&&(i==ch1.length-1)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String string1 = sc.nextLine();

        System.out.println("Enter Second String");
        String string2 = sc.nextLine();

        boolean isAnagram = isAnagram(string1,string2);
        if(isAnagram) System.out.println("Yes! the string is Anagram.");
        else System.out.println("No! the string is Not Anagaram.");
    }
}
