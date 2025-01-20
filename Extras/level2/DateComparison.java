import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date one in format \"dd-MM-yyyy\" : ");
        String date1=sc.nextLine();
        System.out.println("Enter date two in format \"dd-MM-yyyy\" : ");
        String date2=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDate=LocalDate.parse(date1,formatter);
        LocalDate secondDate=LocalDate.parse(date2,formatter);
        System.out.println(firstDate+" is before "+secondDate+" " +firstDate.isBefore(secondDate));
        System.out.println(firstDate+" is after "+secondDate+" "+firstDate.isAfter(secondDate));
        System.out.println(firstDate+" is equal to "+secondDate+" "+firstDate.isEqual(secondDate));


    }
}
