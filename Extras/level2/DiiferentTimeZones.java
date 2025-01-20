import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DiiferentTimeZones {
    public static void main(String[] args) {

        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Date and Time in GMT TimeZone : "+gmt);
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date and Time in IST TimeZone : "+ist);
        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Date and Time in PST TimeZone : "+pst);

    }
}
