class Circle{

    public int radius;
    Circle(){
        System.out.println("I am a non param of circle constructor");
    }
    Circle(int r){
        this.radius=r;
        System.out.println(" I am a cylinder parameterized constructor");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r , int h){super(r);
        System.out.println();
        this.height=h;
    }
    public double valume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class exe_52 {
    public static void main(String[] args) {
      // Circle obj = new Circle(int r);
        Cylinder obj = new Cylinder(12, 5);
        System.out.println(obj.area());
    }
}
