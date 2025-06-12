package task;

import java.util.Scanner;

public class arraytask {
    static void sumofarray (int[] a,int n){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];

        System.out.println(sum);

    }
    static void largestelement(int[]a,int n){
        int max=a[0];

        for(int i=0;i<n;i++)
            if(a[i]>max)
                max=a[i];

        System.out.println(max);
    }
    static void smallestelement(int[]a,int n){
        int min=a[0];
        for(int i=0;i<n;i++)
            if(a[i]<min)
                min=a[i];
        System.out.println(min);
    }
    static void sortarray(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
    static void removeduplicate(int a[],int n){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    for(int k=j;k<n-1;k++) {
                        a[k] = a[k + 1];

                        for (int ii = 0; ii < n; ii++) {
                            System.out.print(a[ii] + " ");
                        }
                    }
                    n--;
                }
            }
        }
//        for(int i=0;i<a.length;i++)
//            System.out.print("originl"+a[i]+" ");
//        for(int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
    }
    static void reversestring(String ss){
        int l=ss.length();
        int i=0;
        char s[] = ss.toCharArray();
        l--;
        while(i<l){
            char p=s[i];
            s[i]=s[l];
            s[l]=p;
            i++;
            l--;
        }
        System.out.println(s);
    }
    static void secondlargest(int []a,int n){
        int max=-1000000,sec=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                sec=max;
                max=a[i];
            }
            else if(a[i]>sec && max!=a[i])
                sec=a[i];

        }
        System.out.println(sec);

    }

    static void mergearray(int []a,int b[],int n,int n1){
        int c[]=new int[n+n1];
        int i=0,j=0,p=0;
        while(true){
            if(a[i]<b[j] && i<n){
                c[p]=a[i];
                i++;
            }

            else if(a[i]>b[j] && j<n1){
                c[p]=b[j];
                j++;

            }
            else break;
            p++;
        }
        for(int k=0;k<n+n1;k++)
            System.out.println(c[k]);
    }
    static void smallestmissing(int[]a,int n){
        int temp=0,p=0,tt=0;
        for(int i=0;i<n;i++){
            if(a[i]<0) tt++;
            for(int j=i;j<n;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        if(tt!=n){
            for(int i=0;i<n-1;i++){
                if(a[i]+1!=a[i+1] && a[i]>0 && a[i]!=a[i+1]){
                    p=1;
                    temp=a[i]+1;
                }
            }
            if(p==0) temp=a[n-1]+1;
            else System.out.println(temp);
        }
        else
            System.out.println("all number are negative");

    }
    static char nonrepeatingcharacter(String ss){
        char []s=ss.toCharArray();
        int l=s.length,p=0;
        for(int i=0;i<l;i++){
            p=0;
            for(int j=0;j<l;j++){
                if(s[i]==s[j] && i!=j)
                    p=1;
            }
            if(p==0) return s[i];
        }
        return '0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        //sumofarray(a,n);

        //largestelement(a,n);

        //smallestelement(a,n);

        //sortarray(a,n);

        removeduplicate(a,n);

//        String s=sc.next();
//        reversestring(s);

//        secondlargest(a,n);

//        int n1=sc.nextInt();
//        int b[]= {2,4,6,8,10};
//        for(int i=0;i<5;i++)
//            b[i]=sc.nextInt();
//        mergearray(a,b,n,n1);

//        smallestmissing(a,n);

//        String s=sc.next();
//        char p=nonrepeatingcharacter(s);
//        System.out.println(p=='0'?"all character are repeated":p);
        
    }
}
