package level1.out.production.Extras;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void vowelsAndConsonants(String str){
        int countVowels=0;
        int countConsonants=0;
        String st =str.toLowerCase();
        for(int i=0 ;i<str.length();i++){
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'){
                countVowels++;
            }else{
                countConsonants++;
            }
        }
        System.out.println("The total vowels in this text is "+countVowels);
        System.out.println("The total consonants in this text is "+countConsonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str =sc.nextLine();
        vowelsAndConsonants(str);
    }
}

