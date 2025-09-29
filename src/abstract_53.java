abstract class  Parent2{

public Parent2() {
    System.out.println(" I am a base3 constructor");
}

public void SayHello() {
    System.out.println("hello");
}

abstract public void greet();
}
 class   child extends Parent2{
     @Override
     public void greet() {
         System.out.println("good morning");
     }
     static class child2 extends Parent2{
         public void greet() {
             System.out.println("i am good");
         }
     }
 }
public class abstract_53 {
    public static void main(String[] args) {
        Parent2 p = new child();
        child.child2 c = new child.child2();
    }
}

