class Thr1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("good morning");
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
class Thr2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("welcome");
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
public class PracticeSetThread_76 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
    }
}
