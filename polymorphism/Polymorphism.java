abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI App.");
    }
}

class Crypto extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin Wallet.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new Crypto();

        p1.pay(1000);
        p2.pay(500);
        p3.pay(2500);
    }
}
