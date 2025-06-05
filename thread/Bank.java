package thread;

class InsufficentBalance extends Exception{
    InsufficentBalance(String s){
        super(s+"\n");
    }
}
class ATM {
    synchronized double ATM(double balance,double amount)throws InsufficentBalance{
        if(balance>=amount)
            return balance-=amount;
        else
            throw new InsufficentBalance("account doesn't have enough many ATM"+ "\n"+"your accessing amount -->"+amount+"\n balance amount you have--> "+balance);
    }
}
class Netpay{
        synchronized double netpay(double balance,double amount)throws InsufficentBalance{
            if(balance>=amount)
                return balance-=amount;
            else
                throw new InsufficentBalance("account doesn't have enough many netpay"+ "\n"+"your accessing amount -->"+amount+"\n balance amount you have--> "+balance);

    }
}
class  Gpay{
    synchronized double gpay(double balance,double amount)throws InsufficentBalance{
        if(balance>=amount)
            return balance-=amount;
        else
            throw new InsufficentBalance("account doesn't have enough many gpay"+ "\n"+"your accessing amount -->"+amount+"\n balance amount you have--> "+balance);
    }
}
class Phonepay {
    synchronized double phonepay(double balance,double amount)throws InsufficentBalance{
        if(balance>=amount)
            return balance-=amount;
        else
            throw new InsufficentBalance("account doesn't have enough many phonepay"+ "\n"+"your accessing amount -->"+amount+"\n balance amount you have--> "+balance);
    }

}

public class Bank extends Thread{
    double balance;
    Phonepay phoneobj;
    Gpay gpayobj;
    Netpay netpayobj;
    ATM atmobj;
    double amount;
    Bank (Netpay netpayobj,Gpay gpayobj,Phonepay phoneobj,ATM atmobj,double balance){
        this.phoneobj=phoneobj;
        this.atmobj=atmobj;
        this.netpayobj=netpayobj;
        this.gpayobj=gpayobj;
        this.balance =balance;
    }
    public  void run() {
        try {
            balance = gpayobj.gpay(balance, 10);
            balance = phoneobj.phonepay(balance, 250);
            balance = atmobj.ATM(balance, 500);
            balance = netpayobj.netpay(balance, 100);
            System.out.println("Final transaction amount  u have-->"+balance+"\n");

        } catch (InsufficentBalance e) {
            System.out.println(e);
        }

    }
}

class Threadcreate{
    public static void main(String[] args) {
        Phonepay phoneobj=new Phonepay();
        ATM atmobj=new ATM();
        Gpay gpayobj=new Gpay();
        Netpay netpayobj=new Netpay();

        Bank user1=new Bank(netpayobj,gpayobj,phoneobj,atmobj,50000);
        Bank user2=new Bank(netpayobj,gpayobj,phoneobj,atmobj,100);
        Bank user3=new Bank(netpayobj,gpayobj,phoneobj,atmobj,2578);
        Bank user4=new Bank(netpayobj,gpayobj,phoneobj,atmobj,500);
        user1.start();
        user2.start();
        user3.start();
        user4.start();

    }
}