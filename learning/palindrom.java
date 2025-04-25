package learning;

import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int p=n,x=0;

        while(p!=0){
            x=x*10+(p%10);
            p/=10;
        }
        if(n==x)System.out.print("its's a learning.palindrom number");
        else System.out.print("it's not a learning.palindrom number");
    }

}
