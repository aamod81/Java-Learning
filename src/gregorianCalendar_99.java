import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorianCalendar_99 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/INDIA"));
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE) +":"+c.get(Calendar.SECOND));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2016));
    }
}

