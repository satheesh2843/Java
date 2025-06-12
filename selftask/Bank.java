package selftask;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s){
        super(s);
    }
}
interface Alert{
    void notifyUser();
}

public class Bank {
    String bankname="State Bank";
    class Account{
        static String accountholder;
        static int accountNumber;
        static double balance;
        Account(String accountholder, int accountNumber, double balance){
            this.accountholder=accountholder;
            this.accountNumber=accountNumber;
            this.balance=balance;
        }
        void showBalance(){
            System.out.println("Account Holder : "+ accountholder);
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Balance : Rs. " +balance);
        }

    }
    void processTransaction(double amount) throws Exception{
        class TransactionProcessor {

            void process(double amount) throws Exception{
                if(amount>Account.balance) throw new InsufficientFundsException("Insufficient balance");
                else System.out.println("Transaction successfull.");
                Account.balance-=amount;
                System.out.println("Balance: Rs." +Account.balance);
            }
        }
        TransactionProcessor obj=new TransactionProcessor();
        obj.process(amount);
    }

    public static void main(String[] args) throws Exception{
        Bank obj1=new Bank();
        Bank.Account obj2=obj1.new Account("satheesh", 1001, 27589);

        Alert obj=new Alert() {
            @Override
            public void notifyUser() {
                if(Account.balance<1000) System.out.println("Low Balance Alert!");
                else System.out.println("All good with your account.");
            }
        };

        obj2.showBalance();
        obj1.processTransaction(2000);
        obj.notifyUser();
    }
}
