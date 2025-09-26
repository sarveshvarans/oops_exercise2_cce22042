class Encapsulation {
    private String accountHolder;
    private double balance;
    private String pin;

        public Encapsulation(String accountHolder, double balance, String pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    
    public double getBalance(String enteredPin) {
        if (enteredPin.equals(pin)) {
            return balance;
        } else {
            System.out.println("Invalid PIN! Access Denied.");
            return -1;
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
    }

    public void withdraw(double amount, String enteredPin) {
        if (enteredPin.equals(pin) && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed: Check PIN/Balance.");
        }
    }

    public static void main(String[] args) {
        Encapsulation account = new Encapsulation("Aarav", 5000, "1234");
        System.out.println("Balance Check: " + account.getBalance("1234"));
        account.deposit(1000);
        account.withdraw(2000, "1234");
        account.getBalance("0000"); 
    }
}
