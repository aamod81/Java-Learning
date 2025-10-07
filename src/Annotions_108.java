 class NewPhone {
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
     public int sum (int a, int b){
        return a+b;
     }
 }
public class Annotions_108 {
    @SuppressWarnings("desprecation")
    public static void main(String[] args)
    {
        NewPhone Phone = new NewPhone();

    }
}
