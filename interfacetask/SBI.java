package interfacetask;

import java.util.Scanner;

interface bankoperations{
    void deposit(int amount);
    void withdraw(int amounnt);
    void checkbalance();
    void openaccount();
    void closeaccount();
}
public class SBI implements bankoperations
{
    int acc=10000;
    public void deposit(int amount){
        acc+=amount;
        System.out.println("successfully deposited amount");
    }
    public void withdraw(int amount){
        if(amount>acc) System.out.println("insufficient amount");
        else {
            acc-=amount;
            System.out.println("withdraw succesfully");
        }
    }
    public void checkbalance(){
        System.out.println(acc);
    }
    public void openaccount(){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("enter your detail stuff");
    }
    public void closeaccount(){
        System.out.println("enter your pin to deacctivate your account");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        System.out.println("deactivated successfully");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your option \n 1. deposit \n 2. withdraw \n 3. checkbalannce \n 4. openaccount \n 5. cloaeaccount");
        int op=sc.nextInt(),amount;
        SBI obj=new SBI();
        switch (op){
            case 1:
                System.out.println("deposit amount");
                amount=sc.nextInt();
                obj.deposit(amount);
                obj.checkbalance();
                break;
            case 2:
                System.out.println("withdraw amount");
                amount=sc.nextInt();
                obj.withdraw(amount);
                break;
            case 3:
                obj.checkbalance();
                break;
            case 4:
                obj.openaccount();
                break;
            case 5:
                obj.closeaccount();
                break;
            default:
                System.out.println("you enter wrong option \n try again later");
        }
    }
}
