import java.util.Scanner;

public class PracticeSet_86 {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks= new int [5];
        marks[0]=5;
        marks[1]=5;
        marks[2]=5;
        marks[3]=5;
        marks[4]=5;
        Scanner input = new Scanner(System.in);
        int index;
        int i =0;
        while(flag && i<4){
          try{  index=input.nextInt();
            System.out.println("the value of marks [index] is :" +marks[index]);
            i++;
        } catch (Exception e){
              System.out.println("invalid index");
          i++;
          }
        }
    }
}
