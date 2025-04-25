package learning;

import java.util.*;
public class method {

    // variable length argument
    // int v(int ...v)

    int x=10;// instance variable
    static int  xx=10;

    int addition(int a,int b){
        return a+b;
    }
    int subraction(int a,int b){
        return a-b;
    }
    int multipilcaion(int a,int b){
        return a*b;
    }
    int division(int a,int b){
        return a/b;
    }
    int modulus(int a,int b){
        return a%b;
    }
    boolean boo(int a,int b){
        return a<b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        method ad=new method();
        System.out.println(ad.addition(a,b));
        System.out.println(ad.subraction(a,b));
        System.out.println(ad.multipilcaion(a,b));
        System.out.println(ad.division(a,b));
        System.out.println(ad.modulus(a,b));
        System.out.println(ad.boo(a,b));
    }
}
