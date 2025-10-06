import java.util.*;

public class arraylist_91 {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<>();
        ArrayList<Object> l2 = new ArrayList<>();
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(5);
        l1.add(0,6);
        l1.addAll(l2);
        l1.set(0,555);
        System.out.println(l1.contains(5));
        System.out.println(l1.lastIndexOf(5));
        for (int i = 0;i< l1.size(); i++) {
            System.out.println(l1.get(i));
        }

    }
}
