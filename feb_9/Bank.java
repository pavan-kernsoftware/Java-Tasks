package feb_9;
class Bank{

    static int balance = 1000;

    static void deposit(int amount) {
        balance = balance + amount;
    }

    static void withdraw(int amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    public static void main(String[] args) {
        deposit(500);
        withdraw(200);
        System.out.println("Balance: " + balance);
    }
}
