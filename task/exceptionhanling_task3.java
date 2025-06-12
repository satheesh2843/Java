package task;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String s){
        super(s);
    }
}
class DailyLimitExceededException extends Exception{
    DailyLimitExceededException(String s){
        super(s);
    }
}
public class exceptionhanling_task3 {
    static int balance=29500;
    static boolean check(int amt)throws Exception{
        if(amt>balance) throw new InsufficientBalanceException("pleace check the balance!!");
        else if(amt>20000) throw new DailyLimitExceededException("Withdraw daily limit 20000 only !!");
        return true;
    }
    static int bal(int amount){
        balance-=amount;
        return balance;
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  your amount to withdraw cash!!!");
        int amt=sc.nextInt();
        if(check(amt))
            System.out.println("the balance amount in your account -->"+ bal(amt));

    }
}
