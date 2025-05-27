package innerclass;


import java.util.Scanner;
import java.time.LocalTime;
public class generatecode {
    static String name;
    void code(String name){
        class codebuilder{
            public void print(){
                LocalTime time=LocalTime.now();
                System.out.println(name+" code-->"+name.hashCode()+"" +time);
            }
        }
        codebuilder obj1=new codebuilder();
        obj1.print();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name to generate your code...");
        name=sc.nextLine();
        generatecode obj=new generatecode();
        obj.code(name);
    }
}
