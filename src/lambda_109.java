public class lambda_109 {
    interface DemoAno {
        void meth1();

        void meth2();
    }

    class AnonyDemo implements DemoAno {
        public void display() {
            System.out.println("This is my display method");
        }

        @Override
        public void meth1() {
            System.out.println("This is my meth1 method");
        }

        @Override
        public void meth2() {
            System.out.println("This is my meth2 method");
        }

        public static void main(String[] args) {
            DemoAno obj = new DemoAno() {
                @Override
                public void meth1() {
                    System.out.println("This is my meth1 method");
                }

                @Override
                public void meth2() {
                    System.out.println("This is my meth2 method");
                }
            };
        }
    }
}