import java.util.Scanner;

public class percentage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the marks of sub1:");
        int mark1 = input.nextInt();
        System.out.println("please enter the marks of sub2:");
        int mark2 = input.nextInt();
        System.out.println("please enter the marks of sub3:");
        int mark3 = input.nextInt();
        System.out.println("please enter the marks of sub4:");
        int mark4 = input.nextInt();
        double percentage = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("The percentage is: " + percentage);
        String grade;
        if (percentage >= 90)
        {
            System.out.println("grade:A");
        } else if (percentage>=80) {
                System.out.println("grade:B");
            } else if  (percentage>=70) {
            System.out.println("grade:C");
        } else if  (percentage>=60) {
            System.out.println("grade:D");
        }
    }
}
