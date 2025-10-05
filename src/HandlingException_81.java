import java.util.Scanner;

public class HandlingException_81 {
    public static void main(String[] args) {
        int [] marks = new int[5];
         marks[0]=7;
         marks[1]=8;
         marks[2]=9;
         marks[3]=10;
         marks[4]=11;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind =sc.nextInt();
        System.out.println("Enter the number you want to divide the value with:");
        int num = sc.nextInt();
        try{
            System.out.println("the value at array index enetered is:"+ marks[ind]);
            System.out.println("the value at array value/number is:"+marks[ind]/ind);
        }  catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
