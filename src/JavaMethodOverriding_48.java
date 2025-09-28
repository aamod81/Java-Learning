class A{
    public int a;
    public int harry(){
        return 4;
    }
public void meth2(){
    System.out.println(" I am a method2 of class A");
}
public void meth3() {   // parent version
        System.out.println(" I am a method3 of class A");}

    static class B extends A{
        @Override
        public void meth2(){
            System.out.println(" I am a method2 of class B");}
        public void meth3(){
            System.out.println(" I am a method3 of class B");
        }
    }
}
public class JavaMethodOverriding_48 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        A.B b = new A.B();
        b.meth3();
    }
}
