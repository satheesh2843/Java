package innerclass;

import java.util.Scanner;

public class greet {

    void generatedgreeting(String lan){
        lan=lan.toLowerCase();
        class greeting{
            void print(String lan){
                if(lan.equals("english"))
                    System.out.println("welcome to home");

                else if(lan.equals("tamil"))
                    System.out.println("varuga varuga!!");
                else if(lan.equals("hindi"))
                    System.out.println("vadakan welcome");
                else System.out.println("language not defined!!!");
            }
        }
        greeting obj1=new greeting();
        obj1.print(lan);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your lang for greeting--> english, tamil, hindi");
        String lan=sc.nextLine();
        greet obj=new greet();
        obj.generatedgreeting(lan);
    }
}
