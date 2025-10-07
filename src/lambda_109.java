public class lambda_109 {
    interface DemoAno {
        void meth1();
        void meth2();
    }

    static final class AnonyDemo implements DemoAno {
        public void display() {
            System.out.println("This is my display method");
        }

        @Override
        public void meth1() {
            System.out.println("This is my meth1 method from AnonyDemo");
        }

        @Override
        public void meth2() {
            System.out.println("This is my meth2 method from AnonyDemo");
        }
    }

    public static void main(String[] args) {
        // Using normal class implementation
        AnonyDemo obj1 = new AnonyDemo();
        obj1.display();
        obj1.meth1();
        obj1.meth2();

        // Using anonymous class
        DemoAno obj2 = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("This is my meth1 method from anonymous class");
            }

            @Override
            public void meth2() {
                System.out.println("This is my meth2 method from anonymous class");
            }
        };

        obj2.meth1();
        obj2.meth2();
    }
}
