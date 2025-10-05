class Thread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while(true) {
        System.out.println("Thankyou");
        i++;
    }}
}
class Thread2 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("welcome");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                e.printStackTrace();}
            }
        }
    }

public class ThreadMethod_75 {
public static void main(String[] args) {
    Thread t1 = new Thread(new Thread1());
    Thread t2 = new Thread(new Thread1());
    t1.start();
    try{
        t1.join();
    }
    catch(Exception e){
        System.out.println("Error");
    }
}
}
