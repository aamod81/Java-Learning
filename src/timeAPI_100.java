import java.time.LocalDate;

public class timeAPI_100 {
 public static void main(String[] args) {
     LocalDate today = LocalDate.now();
     System.out.println(today.getDayOfMonth());
     LocalDate today2 = LocalDate.now();
     System.out.println(today2.getDayOfWeek());
 }
}
