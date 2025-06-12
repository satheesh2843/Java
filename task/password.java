package task;

import java.util.Scanner;

public class password {
    static void pass(String ss ){
        char[]s=ss.toCharArray();
        int letter=0,digit=0,spl=0;
        for(int i=0;i<ss.length();i++){
            if((s[i]>='A' && s[i]<='Z')||(s[i]>='a' && s[i]<='z')) letter++;
            else if(s[i]>='0' && s[i]<='9') digit++;
            else spl++;
        }
        System.out.println((letter+digit)>9 && spl==0 && digit>=2?"password valid ":"not valid");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        pass(s);
    }
}
