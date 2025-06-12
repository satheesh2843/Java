package task;

import java.util.Arrays;
import java.util.Scanner;
import task.arraytask.*;

public class string {
    static void firstinex(String s, char c){
        System.out.println(s.indexOf(c));
    }
    static void palindrom(String ss,int l){
        int st=0,lt=l-1;
        char []s=ss.toCharArray();
        while(st<lt){
            if(s[st]==s[lt]){
                st++;
                lt--;
            }
            else
                break;
        }
        if(lt==st || st-lt==1) System.out.println("it's a palindrom string");
        else System.out.println("it's not a palindrom string");
    }

    static void count(String ss, int l){
        int c=0,v=0;
        ss=ss.toLowerCase();
        char s[]=ss.toCharArray();
        for(int i=0;i<l;i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='e' || s[i]=='u')
                v++;
            else c++;
        }
        System.out.println("the vowel count is -->"+v +"\n the nonvowel count is  -->"+c);
    }
    static void duplicate(String ss,int l){
        char s[]=ss.toCharArray();
        for(int i=0;i<l;i++){
            int p=0;
            for(int j=i+1;j<l;j++){
                if(s[i]==s[j]){
                    p=1;
                    s[j]='-';
                }
            }
            if(p==1&& s[i]!='-')
                System.out.print(s[i]);
        }
    }
    static void anagram(String ss,String pp,int n,int nn){
        ss=ss.toLowerCase();
        char []s=ss.toCharArray();
        pp=pp.toLowerCase();
        char []p=pp.toCharArray();
        int a[]=new int[26],b[]=new int[26],x=0;
        if(n!=nn) System.out.println("it's not an anagram");
        else{
            for(int i=0;i<n;i++)
                a[(int)s[i]-97]++;
            for(int i=0;i<n;i++)
                b[(int)p[i]-97]++;
            for(int i=0;i<26;i++)
                if(a[i]!=b[i]) {
                    x=1;
                    break;
                }
        }
        if(x==0) System.out.println("the two string are anagram");
        else System.out.println("not an anagram string");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        //first idex of the character
//        char c=sc.next().charAt(0);
//        firstinex(s,c);

        // reverse a string
//        arraytask.reversestring(s);

        // check the sring is palindrom or not
//        palindrom(s,l);

        //count the vowel and constant
//        count(s,l);


        //print the duplicate element in string
//        duplicate(s,l);

        // anagram  check
        String p=sc.nextLine();
        anagram(s,p,l,p.length());

        System.out.println("task completed");
    }
}
