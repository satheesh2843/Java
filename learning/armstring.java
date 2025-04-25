package learning;

import java.util.*;

import static java.lang.Math.*;

public class armstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int l= (int) log10(n)+1;
        int nn=n,c=0;
        while(nn!=0){
            int x=nn%10,co=l,p=1;
            while(co!=0){
                p*=x;
                co--;
            }
            c+=p;
            nn/=10;
        }
        if(c==n)System.out.print("its a armstrong number");
        else System.out.print("it's not a armstrong number");
    }
}
