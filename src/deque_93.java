import java.util.ArrayDeque;

public class deque_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad1.add(11);
        ad1.add(23);
        ad1.add(31);
        ad1.add(49);
        System.out.println(ad1.contains(11));
        System.out.println(ad1.add(4));
        System.out.println(ad1.getFirst());
        System.out.println(ad1.stream());
        System.out.println(ad1.pop());
        System.out.println(ad1.getLast());
    }
}
