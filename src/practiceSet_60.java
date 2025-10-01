//abstract class pen {
////    abstract void write();
//    abstract void refill();
//    }
//class fountainPen extends pen{
//    void write(){
//        System.out.println("write");
//    }
//    void refill(){
//        System.out.println("refill");
//    }
//    void changeNib(){
//        System.out.println("changeNib");
//    }
//}
class monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
 class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
     void speak(){
        System.out.println("hello sir");
    }

}
public class practiceSet_60 {
    public static void main(String[] args) {
//       q1 fountainPen pen = new fountainPen();
//        pen.changeNib();
         human aamod= new human();
         aamod.eat();
         aamod.sleep();
    }
}
