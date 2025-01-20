import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static int generateRandomNumber(int upperbound){
        Random random=new Random();
        return random.nextInt(upperbound);
    }
    public static int nextGuess(int lowerbound, int upperbound){
        Random random=new Random();
        return random.nextInt(lowerbound,upperbound);
    }
    public static String userFeedback(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your feedback : ");
        String feedback=sc.next();
        return feedback;
    }
    public static void play(){
        int lowerbound=1;
        int upperbound=100;
        boolean guessed=false;
        int number=generateRandomNumber(upperbound);
        while(!guessed){
            System.out.println("Is your number "+number+"?");
            String feedback=userFeedback();

            switch (feedback){
                case "high":
                    upperbound=number;
                    number=nextGuess(lowerbound,upperbound);
                    break;
                case "low":
                    lowerbound=number;
                    number=nextGuess(lowerbound,upperbound);
                    break;
                case "correct":
                    System.out.println("Hooray! Your number is "+number);
                    guessed=true;
                    break;
                case "default":
                    System.out.println("Invalid feedback!");

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 to 100");
        System.out.println("Give feedback as \"high\", \"low\", or \"correct\"!");
        System.out.println("Press enter to start!");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        play();
    }
}
