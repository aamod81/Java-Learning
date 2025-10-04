class MyThread1  extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println(" my thread is running");
            System.out.println("i am happy");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println(" my thread is running");
            System.out.println("i am sad");
        }
    }
}
public class multithreading_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
