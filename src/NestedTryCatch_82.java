import java.util.Scanner;

public class NestedTryCatch_82 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the index");
        int n = sc.nextInt();
        try{
            System.out.println("welcome to my github profile");
            try {
                System.out.println(marks[n]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
