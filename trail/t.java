package trail;

public class t {
}
class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(String source, int amount) {
        System.out.println(source + " is processing your withdraw: ₹" + amount);
        if (balance >= amount) {
            System.out.println( "Transaction  processing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(source + " withdrawal successful! Remaining Balance: ₹" + balance);
        } else {
            System.out.println(source + " - Insufficient balance. Available: ₹" +( balance - amount));
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Atm extends Thread {
    BankAccount account;

    Atm(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw("ATM", 600);
    }
}

class Gpay extends Thread {
    BankAccount account;

    Gpay(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw("GPay", 600);
    }
}


class Banktransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Atm A1 = new Atm(account);
        Gpay G1 = new Gpay(account);

        A1.start();
        G1.start();
    }
}