class Thr1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("good morning");
        }
    }
}
class Thr2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("welcome");
        }
    }
}
public class PracticeSetThread_76 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.start();
        t2.start();
    }
}
