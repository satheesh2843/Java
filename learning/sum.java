package learning;

import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0,p=1;

        for(int i=1;i<=n;i++) s=s+ i;

        for(int i=1;i<=n;i++) p*=i;

        System.out.println("learning.sum of digits-->"+s);
        System.out.println("factorial of digit-->"+p);
    }
}
