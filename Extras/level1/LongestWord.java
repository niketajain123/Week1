package level1.out.production.Extras;

import java.util.Scanner;

public class LongestWord {
    //method for find longest word
    public static String longestWord(String str){
        String[] words = str.split("\\s+");
        String longestWord = "";

        // Find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        String word= longestWord(str);
        System.out.println("The Longest word in given sentence is : "+word);
    }
}
