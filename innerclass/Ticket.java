package innerclass;

import java.util.Scanner;

public class Ticket {

    void calculateticketprice(){
        Scanner sc=new Scanner(System.in);
        String name,movie;
        int age;
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter your movie type-->1D/2D/3D");
        movie=sc.nextLine();
        System.out.println("enter your age!!");
        age=sc.nextInt();
        class Pricecalculator{
            void cal(String name,String type,int age){
                int p1;
                if(age<19) p1=100;
                else if(age<30) p1=200;
                else p1=300;
                if(type.equals("1D")) p1+=100;
                else if(type.equals("2D")) p1+=450;
                else p1+=780;
                System.out.println("price for the ticket--> "+p1);
            }
        }
        Pricecalculator obj=new Pricecalculator();
        obj.cal(name, movie, age);

    }
    public static void main(String[] args) {
        Ticket obj=new Ticket();
        obj.calculateticketprice();
    }
}
