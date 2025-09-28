class Base1 {
    // no-arg constructor
    Base1() {
        System.out.println("i am a default constructor of Base1");
    }

    // parameterized constructor
    Base1(int a) {
        System.out.println("i am a constructor overload with the value of :" + a);
    }

    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    // no-arg constructor
    Derived1() {
        super(); // calls Base1()
        System.out.println("i am a derived class constructor");
    }

    // parameterized constructor
    Derived1(int x, int y) {
        super(x); // calls Base1(int a)
        System.out.println("i am a derived class constructor with the value of :" + x);
        this.y = y;
    }

    public int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class inheritence_46 {
    public static void main(String[] args) {
        // calls Base1(int a)
        Base1 b = new Base1(0);

        // calls Base1(), then Derived1()
        Derived1 d = new Derived1();

        // calls Base1(int a), then Derived1(int x, int y)
        Derived1 d1 = new Derived1(66, 88);
    }
}
