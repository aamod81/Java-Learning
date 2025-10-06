class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "radius can't be negative";
    }}
public class throw_84 {
    public static double area(int r) throws negativeRadiusException{
        if(r<0){
            throw new ArithmeticException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(1,2);
            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
