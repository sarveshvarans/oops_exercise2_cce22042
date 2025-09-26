abstract class Drone {
    abstract void takeOff();
    abstract void deliverPackage(String destination);
    abstract void land();

    public void safetyCheck() {
        System.out.println("Safety check complete");
    }
}

class DeliveryDrone extends Drone {
    void takeOff() {
        System.out.println("Delivery Drone taking off...");
    }
    void deliverPackage(String destination) {
        System.out.println("Delivering package to: " + destination);
    }
    void land() {
        System.out.println("Delivery Drone landing safely.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Drone drone = new DeliveryDrone();
        drone.safetyCheck();
        drone.takeOff();
        drone.deliverPackage("Amrita Vishwa Vidyapeetham, Chennai");
        drone.land();
    }
}
