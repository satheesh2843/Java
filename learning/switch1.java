package learning;

import java.util.*;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int n=sc.nextInt();
        switch(s){
            case "erode":
                System.out.print(n*3);
                break;
            case "covai":
                System.out.print(n*5);
                break;
            case "madurai":
                System.out.print(n*4);
                break;
            case "chennai":
                System.out.print(n*7);
                break;
            default:
                System.out.print(n*2);
        }
    }
}
