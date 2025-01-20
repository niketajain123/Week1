import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDateTime currentDate=LocalDateTime.now();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Current date in \"dd/MM/yyyy pattern\" : "+formatter.format(currentDate));
        formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Current date in \"yyyy-MM-dd\" pattern: "+formatter.format(currentDate));
        formatter=DateTimeFormatter.ofPattern("EEEE MMM dd, yyyy");

        System.out.println("Current date time in \"EEEE MMM dd, yyyy\" pattern : "+currentDate.format(formatter));
        System.out.println();
        System.out.println();
        System.out.println(currentDate);

    }
}
