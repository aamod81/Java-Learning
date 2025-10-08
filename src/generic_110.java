import java.util.ArrayList;
class Mygeneric<T1>{
    int value;
    private T1 t1;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Mygeneric(T1 t1){
        this.t1 = t1;
        value = value;
    }
}
public class generic_110 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(6);
        list.add(2);
        list.add(7);
        int a =  (int)list.get(0);
        int b = list.get(1);
        System.out.println(b);
        Mygeneric<String> mygeneric = new Mygeneric(6);
        System.out.println(mygeneric.getValue());
    }
}
