import java.util.Scanner;

class Myexception extends Exception{
     public String toString(){
         return super.toString()+"I am tostring";
     }
     public String getMessage(){
         return super.getMessage()+"I am getMessage";
     }
}
public class ExceptionClass_83 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
             //   throw new Myexception();
                throw new ArithmeticException( " Arithmetic Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finshed");
            }
            System.out.println("yes finished");
        }
    }
}
