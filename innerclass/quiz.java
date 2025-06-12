package innerclass;

import java.util.Scanner;

public class quiz {

    void startquiz(){
        Scanner sc=new Scanner(System.in);
        class timer{
            void time(){
                for(int i=1;i<6;i++) System.out.println("second-->"+i);
                System.out.println("time's up!!!!");
            }
        }
        timer obj=new timer();
        System.out.println("enter --> 1 to start the quiz!!");
        int n=sc.nextInt();
        if(n==1)obj.time();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        quiz obj=new quiz();
        obj.startquiz();
    }
}
