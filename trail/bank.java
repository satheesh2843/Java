package trail;

import java.util.Scanner;

class INSUFFICIENTBALANCE extends Exception{
    INSUFFICIENTBALANCE(String s){
        super(s);
    }
}
class LIMIT extends Exception{
    LIMIT(String s){
        super(s);
    }
}
public class bank  {
    static boolean check(int amt) throws Exception{
        if(amt>balance) throw new INSUFFICIENTBALANCE("your account doesn't have enough money!!");
        else if(amt>dailylimit) throw new LIMIT("daily limit reached!!!");
        return true;
    }
    static int withdraw(int amt){
        balance-=amt;
        return balance;
    }
    static int balance=27500;
    static  int dailylimit=10000;
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        if(check(amt)) System.out.println("balance amount is --> "+withdraw(amt));
    }
}
