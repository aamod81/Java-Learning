import java.util.Scanner;

public class SwitchCase_19 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your income to calculate the tax:");
        float tax = 0;
        float income = scan.nextFloat();
        if(income<2.5){
            tax=tax+0;
        } else if(income>2.5f&& tax<5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income>5f&&tax<10f){
            tax = tax+  0.05f * (5f-2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income>10f) {
            tax = tax +0.05f *(5.0f-2.5f);
            tax = tax + 0.2f * (10f-5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("Your tax is "+tax);
    }
}
