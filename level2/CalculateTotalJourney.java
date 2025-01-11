import java.util.Scanner;
public class CalculateTotalJourney{
	public static void main(String[]args){
		//declaring variables
		String name,fromCity , viaCity , toCity ;
		double distanceFromToVia,distanceViaToFinalCity;
		int timeFromToVia,timeViaToFinalCity;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter user name : ");
		name=sc.next();
		System.out.println("Enter city name from where journey started : ");
		fromCity=sc.next();
		System.out.println("Enter city name via reached destination : ");
		viaCity=sc.next();
		System.out.println("Enter city name where journey ended : ");
		toCity=sc.next();
		System.out.println("Enter distance from Chennai to Vellore : ");
		distanceFromToVia=sc.nextDouble();
		System.out.println("Enter distance from Vellore to Bangalore : ");
		distanceViaToFinalCity=sc.nextDouble();
		System.out.println("Enter time taken from Chennai to Vellore in minutes : ");
		timeFromToVia=sc.nextInt();
		System.out.println("Enter time taken from Vellore to Bangalore in minutes : ");
		timeViaToFinalCity=sc.nextInt();
		
		//calculating total distance and total time taken from source to destination
		double totalDistance=distanceFromToVia+distanceViaToFinalCity;
		int totalTime=timeFromToVia+timeViaToFinalCity;
		
		//printing salary, bonus and total income
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
	}
}
