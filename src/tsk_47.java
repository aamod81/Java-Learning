 class EKClass{
    int a;

     public int getA() {
         return a;
     }

     EKClass(int V){
       this.a=V;
    }
    public int reutrnone(){
        return 1;
    }
 }
public class tsk_47 {
    public static void main(String[] args) {
        int i = 5;
        EKClass e = new EKClass (5);
        System.out.println(e.getA());
    }
}
