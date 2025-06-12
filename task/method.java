package task;

import java.util.*;

public class method {
    static int count(String s){
        int x=1;
        char[]ss=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ss[i]==' ') x++;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
    }
}
