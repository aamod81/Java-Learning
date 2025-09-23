public class logical_17 {
    public static void main(String[] args ) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a && b) {
            System.out.println(true);
        } else if (a && b && c) {
            System.out.println(false);
        } else {
            System.out.println("error");
        }
    }}
