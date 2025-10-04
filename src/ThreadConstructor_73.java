class Mythre extends Thread{
     public Mythre( String name) {
         super(name);
     }
     public void run(){
        // while(true){
             System.out.println("I am a thread");
         }
     }
//}
public class ThreadConstructor_73 {
    public static void main(String[] args) {
        Mythre t1 = new Mythre("aamod");
        Mythre t2 = new Mythre("lucky");
        t1.start();
        System.out.println("The Id Of Thread is "+t1.getId());
        System.out.println("The Name Of Thread is "+t1.getName());
        System.out.println("The Name Of Thread is "+t2.getName());
        System.out.println("The Name Of Thread is "+t2.getId());
    }
}
