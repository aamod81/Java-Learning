
public class Try_80 {
    public static void main(String[] args) {
        int a =600;
        int b =0;
        try {
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception e){
            System.out.println("we failed to solve it the reason is:");
            System.out.println(e);
        }
        System.out.println("End of The Program");
    }
}
