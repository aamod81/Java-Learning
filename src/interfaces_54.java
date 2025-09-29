import org.w3c.dom.ls.LSOutput;

interface bicycle{
    int a = 45;
    void applyBrake( int decrement);
    void speedUp( int increment);
}
interface Hornbicycle{
    void blowHornk3g();
    void blogHornkmhn();
}
 class harculus implements bicycle{
     void blowhorn(){
         System.out.println(" pee poooo peeee pe");
     }
     public void applyBrake( int decrement){
         System.out.println("applying brake");
     }
     public void speedUp( int increment){
         System.out.println("speeding up");
     }
     void blowHornK3g(){
         System.out.println("blowing hornk3g");
     }
     void blowHornmhn(){
         System.out.println("blowing hornmhn");
     }
 }
public class interfaces_54 {
    public static void main(String[] args) {
        harculus cycleAamod = new harculus();
        cycleAamod.applyBrake(4 );
        System.out.println(cycleAamod.a);
        cycleAamod.speedUp( 5 );
        System.out.println(cycleAamod.a);
        cycleAamod.blowhorn();
        System.out.println(cycleAamod.a);
        cycleAamod.blowHornmhn();
        cycleAamod.blowHornK3g();
    }
}
