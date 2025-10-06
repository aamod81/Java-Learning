import java.util.Calendar;
import java.util.TimeZone;

public class calendar_98 {
public static void main(String[] args) {
    Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/INDIA"));
    System.out.println(c.getTime());
    System.out.println(c.getTimeZone().getID());
    System.out.println(c.getCalendarType());
}
}
