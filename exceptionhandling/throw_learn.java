package exceptionhandling;

import java.util.Scanner;

class Accesslimitdenied extends Exception{
    Accesslimitdenied(String s){
        super(s);
    }
}
public class throw_learn {

//    static boolean checkuserid(int userid) throws Accesslimitdenied{
//        int count=0;
//        for(int i=0;i<a.length;i++){
//            if(userid==a[i]) return true;
//        }
//        throw new Accesslimitdenied("New user are not permited to access");
//    }

    static void checkuseridd() throws Accesslimitdenied{
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5],i=0;
        while(true){
            System.out.print("enter your login_id --> ");
            int id=sc.nextInt();

            if(i>4) throw new Accesslimitdenied ("Access limited for the user id-->" + id);
            a[i++]=id;
        }
    }
    public static void main(String[] args) throws Accesslimitdenied {
        Scanner sc=new Scanner(System.in);

//        System.out.println("enter your user id");
        checkuseridd();
//        int userid=sc.nextInt();
//        if(checkuserid(userid)) System.out.println("access granted!!");

    }
}

