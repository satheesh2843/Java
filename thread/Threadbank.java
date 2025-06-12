//
//package thread;
//
//class InsufficentBalance extends Exception{
//        InsufficentBalance(String s){
//        super(s);
//    }
//}
//class  Gpay extends Thread{
//
//    public void run(){
//        if(balance>=amount)
//            return balance-=amount;
//        else
//            throw new InsufficentBalance("account doesn't have enough many gpay"+ "\n"+"your accessing amount -->"+amount);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
// class Phonepay extends Thread{
//    synchronized double phonepay(double balance,double amount)throws InsufficentBalance{
//        if(balance>=amount)
//            return balance-=amount;
//        else
//            throw new InsufficentBalance("account doesn't have enough many phonepay"+ "\n"+"your accessing amount -->"+amount);
//    }
//
//}
//class Netpay extends Thread{
//    synchronized double netpay(double balance,double amount)throws InsufficentBalance{
//        if(balance>=amount)
//            return balance-=amount;
//        else
//            throw new InsufficentBalance("account doesn't have enough many netpay"+ "\n"+"your accessing amount -->"+amount);
//
//    }
//}
//class Tranfer {
//    Gpay gpay;
//    Phonepay phonepay;
//    Netpay netpay;
//    double balance;
//    Tranfer(Gpay gpay, Phonepay phonepay, Netpay netpay,double balance){
//        this.balance=balance;
//        this.netpay=netpay;
//        this.gpay=gpay;
//        this.phonepay=phonepay;
//    }
//    Tranfer(){
//        System.out.println("transaction started!!");
//    }
//    public static void main(String[] args) {
//        Tranfer obj=new Tranfer();
//        obj.gpay.start();
//        obj.netpay.start();
//        obj.phonepay.start();
//
//    }
//}
//
//public class Threadbank {
//    public static void main(String[] args) {
//        Gpay gpay=new Gpay();
//        Phonepay phonepay=new Phonepay();
//        Netpay netpay=new Netpay();
//
//    }
//}
