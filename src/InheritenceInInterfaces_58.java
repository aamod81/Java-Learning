interface sampleinterface{
    void method1();
    void method2();
}
 interface childsampleinterface extends sampleinterface{
    void method3();
    void method4();
}
class Mysampleclass implements sampleinterface{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
    public void method4(){
        System.out.println("method4");
    }
}
public class InheritenceInInterfaces_58 {
    public static void main(String[] args) {
        Mysampleclass obj = new Mysampleclass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
