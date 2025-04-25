package task;

import java.util.*;

public class vowel {
    static void vow(String ss ){
        char[]s=ss.toCharArray();
        int letter=0;
        char p;
        for(int i=0;i<ss.length();i++) {
            if (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u') letter++;
        }
        System.out.println(letter==0?"all are vowel letter":"not it's not");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        vow(s);
    }
}
