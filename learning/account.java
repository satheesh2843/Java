package learning;

import java.util.*;
public class account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=0;
        System.out.print("enter the learning.account number: ");
        long ac=sc.nextInt();
        System.out.print("enter the pin number:");
        pin=sc.nextInt();
        while(true){
            if(ac==1100110011 && pin==1234){
                System.out.print("verified successfully");
                break;
            }
            System.out.println("you enter wrong (pin || learning.account) number");
            System.out.println("Re-enter the learning.account number: ");
            ac=sc.nextInt();
            System.out.println("re-enter the pin number:");
            pin=sc.nextInt();
        }
    }
}
