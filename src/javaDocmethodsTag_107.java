public class javaDocmethodsTag_107 {
    /**
     *
     * @param args These are arguments supplied to the commond line
     */
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }

    /**
     * Hello this is a method This is verry helpfull method
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two integer numbers
     * @throws Exception if  A is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int a, int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        int c = a+b;
        return a+b;
    }
}
