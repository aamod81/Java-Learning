class phone {
    public  void whoAreyou (){
        System.out.println(" I am one");
    }
}
class smartphone extends phone {
    public  void padharo(){
        System.out.println("cutiee");
    }
    public  void on (){
        System.out.println("turning on phone");
    }
}
public class DynamicMethodDispatch_49 {
public static void main(String[] args) {
    phone obj = new phone();
    smartphone obj2 = new smartphone();
    obj.whoAreyou();
    phone obj3= new smartphone();
    obj2.on();

}
}
