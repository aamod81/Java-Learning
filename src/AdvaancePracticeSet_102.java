import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class AdvaancePracticeSet_102 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("student1");
        ar.add("student2");
        ar.add("student3");
        ar.add("student4");
        ar.add("student5");
        ar.add("student6");
        ar.add("student7");
        ar.add("student8");
        ar.add("student9");
        ar.add("student10");
        for (Object o : ar) {
            System.out.println(o);
        }
//        HashSet<Integer> hs = new HashSet();
//        hs.add(1);
//        hs.add(5);
//        System.out.println(hs);

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime()+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }
}