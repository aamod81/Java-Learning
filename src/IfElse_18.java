import java.util.Scanner;

public class IfElse_18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
       int age= sc.nextInt();
        if(age>=56){
            System.out.println("you are experienced");
        }
        else if(age>35&&age<45){
            System.out.println("you are mid");
        }else{
            System.out.println("you are not experienced");
        }
    }
}
