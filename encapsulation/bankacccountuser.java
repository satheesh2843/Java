package encapsulation;

import java.util.Scanner;

class account{
    private double balance=10000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(balance>=amount)
            balance-=amount;
        else
            System.out.println("not enough money");
    }
}

public class bankacccountuser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        account obj=new account();
        System.out.println(obj.getBalance());
        System.out.println("enter your withdraw amount");
        double withdrawmaount=sc.nextInt();
        obj.withdraw(withdrawmaount);
        System.out.println(obj.getBalance());
    }
}
