package thread;

class InsufficientBalance extends Exception{
    InsufficientBalance(String s){
        super(s);
    }
}
class Transaction{
    private static double balance=7500;
    Transaction(){
        this.balance=balance;
    }
    static synchronized void trans(String source,double amount) throws Exception{
        System.out.println("Please wait we cheking your bank details!!!");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(amount<=balance){
            System.out.println(source+" --> amount withdraw successfully!!"+"amount-->"+amount);
            balance-=amount;
            System.out.println("Balance amount in your amount-->"+balance);
        }
        else {
            throw new InsufficientBalance(source+" your transaction Failed!!!"+"\nBalance amount in your amount-->"+balance);
        }
    }
}
class ATM extends Thread{
    Transaction trs;
    double amount;
    ATM(Transaction trs,double amount){
        this.trs=trs;
        this.amount=amount;
    }
   public void run(){
       try {
           trs.trans("ATM",amount);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
}
class Paytm extends Thread{
    Transaction trs;
    double amount;
    Paytm(Transaction trs,double amount){
        this.trs=trs;
        this.amount=amount;
    }
    public void run(){
        try {
            trs.trans("Paytm",amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class Gpay extends Thread{
    Transaction trs;
    double amount;
    Gpay(Transaction trs,double amount){
        this.trs=trs;
        this.amount=amount;
    }
    public void run(){
        try {
            trs.trans("Gpay",amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class Netpay extends Thread{
    Transaction trs;
    double amount;
    Netpay(Transaction trs,double amount){
        this.trs=trs;
        this.amount=amount;
    }
    public void run(){
        try {
            trs.trans("Netpay",amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class Banksys  {
    public static void main(String[] args) {
        Transaction obj=new Transaction();
        Transaction obj1=new Transaction();
        Transaction obj2=new Transaction();
        Transaction obj3=new Transaction();
        Transaction obj4=new Transaction();


        ATM atm=new ATM(obj,1000);
        Paytm paytm=new Paytm(obj1,2750);
        Netpay netpay=new Netpay(obj2,30000);
        Gpay gpay=new Gpay(obj3,5000);
        atm.start();
        paytm.start();
        netpay.start();
        gpay.start();

    }
}


