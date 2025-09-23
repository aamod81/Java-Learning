import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("yes boy you can drive");}
        else {
            System.out.println("no boy u can't drive");
        }
    }
}
