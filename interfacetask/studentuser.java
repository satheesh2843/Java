package interfacetask;

import java.util.Scanner;

interface studentportal{
    void login();
    void viewgrade();
    void subass();
    void logout();
    void contactteacher();
}
public class studentuser {
    void login(){
        System.out.println("login successfully");
    }
    void viewgrade(){
        System.out.println("your grade is --> A");
    }
    void subass(){
        System.out.println("upload your document here");
    }
    void logout(){
        System.out.println("logout successfully");
    }
    void contactteacher(){
        System.out.println("enter your comment in commentbox ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        studentuser obj=new studentuser();
        System.out.println("enter your id to login");
        int id=sc.nextInt();
        obj.login();
        System.out.println("enter your option produced student portal \n 1. viewgrade \n 2. submitassignment \n 3. logoot \n 4. contactteacher");
        int op=sc.nextInt();
        switch (op){
            case 1:
                obj.viewgrade();
                break;
            case 2:
                obj.subass();
                break;
            case 3:
                obj.logout();
                break;
            case 4:
                obj.contactteacher();
                break;
            default:
                System.out.println("u enter wrong option . try again later");
        }
    }
}
