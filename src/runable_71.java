
 class MyThreadRunable implements Runnable{
    public void run(){
        System.out.println("my thread runable");
    }
}
class MyThreadRunable1 implements Runnable{
    public void run(){
        System.out.println("my thread runable1");
    }
}
public class runable_71 {
    public static void main(String[] args) {
        MyThreadRunable t1 = new MyThreadRunable();
        Thread s1 = new Thread(t1);
        MyThreadRunable t2 = new MyThreadRunable();
        Thread s = new Thread(t2);
        s1.start();
        s.start();

    }
}
