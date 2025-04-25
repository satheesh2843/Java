package learning;

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) c++;
        }
        if(c==0) System.out.print("it's learning.prime number");
        else System.out.print("it's not a learning.prime number");
    }
}
