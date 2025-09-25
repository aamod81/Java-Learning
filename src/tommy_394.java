public class tommy_394 {

    static class tommy {
        public void hit() {
            System.out.println("hitting the enemy");
        }
        public void run() {
            System.out.println("tommy is running");
        }
        public void fire() {
            System.out.println("tommy is firing on the enemy");
        }
    }

    public static void main(String[] args) {
        tommy player1 = new tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}



