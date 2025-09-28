class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am setting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inhertence_45 {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setY(5);
        System.out.println(d.getX());
    }
}
