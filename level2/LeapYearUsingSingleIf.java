import java.util.Scanner;

public class LeapYearUsingSingleIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        //condition for leap year
		if(year>=1582&&(year%400==0||(year%100!=0&&year%4==0))){
			System.out.println(year + " is a Leap Year.");
		}
		else if(year>=1582){
                System.out.println(year + " is not a Leap Year.");
		}
			 else {
            System.out.println("The year " + year + " is not valid. It should be >= 1582.");
        }
        sc.close(); // Close the scanner
    }
}

