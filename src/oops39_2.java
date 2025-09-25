public class oops39_2 {

    static class CellPhone {
        public void ring() {
            System.out.println("Calling");
        }

        public void call() {
            System.out.println("Ringing");
        }

        public void aamod() {
            System.out.println("Aamod");
        }
    }

    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.call();
        vivo.ring();
        vivo.aamod();
    }
}

