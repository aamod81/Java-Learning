interface Camera {
    void takesnap();
    void takevideo();
    void takepicture();
}

interface Wifi {
    String[] getnetwork();
    void connectiontonetwork(String network);
}

class MyCellPhone {
    void callnumber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }
    void picknumber(int phonenumber) {
        System.out.println("Connecting " + phonenumber);
    }
}

class SmartPhone extends MyCellPhone implements Wifi, Camera {
    // Camera methods
    public void takesnap() {
        System.out.println("Taking snap");
    }

    public void takevideo() {
        System.out.println("Taking video");
    }

    public void takepicture() {
        System.out.println("Taking picture");
    }

    // Wifi methods
    @Override
    public String[] getnetwork() {
        System.out.println("Searching for networks...");
        String[] network = {"aamod", "shaurya", "adarsh"};
        return network;
    }

    @Override
    public void connectiontonetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class InheritenceMethod_57 {
    public static void main(String[] args) {
        SmartPhone as = new SmartPhone();
        String[] ar = as.getnetwork();
        for (String item : ar) {
            System.out.println(item);
        }

        as.connectiontonetwork("shaurya");

        as.callnumber(123456789);
        as.takesnap();
        as.takevideo();
        as.takepicture();
    }
}
