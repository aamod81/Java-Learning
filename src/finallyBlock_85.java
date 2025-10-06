public class finallyBlock_85 {
    public static int greet() {
        try {
            int a = 5;
            int b = 6;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        } //finally {
         //   System.out.println("this is end of the program");
        //}
        return 0;
    }
    public static void main(String[] args) {
        int k= greet();
        System.out.println(k);
        int a = 7;
        int b = 6;
        while(true){
            try{
                System.out.println(50/5);
            }
            catch (Exception e){
                System.out.println(e);
            }

        finally{
            System.out.println("finallyBlock_85"+b);
        }
b++;
    }}}
