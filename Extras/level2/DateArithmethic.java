import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateArithmethic {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        System.out.println("Current Date : "+currentDate);
        LocalDate newDate=currentDate.plusDays(7);
        newDate=newDate.plusMonths(1);
        newDate=newDate.plusYears(2);
        System.out.println("New date after adding 7days, 1 month, 2 years : "+newDate);
        newDate=newDate.minusWeeks(3);
        System.out.println("New date after subtracting 3 weeks : "+newDate);
    }
}
