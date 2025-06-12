package task;
import task.exceptionhandling_task01.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling_task02 {
    static void task(int a){
        String arr[]=new String[12];
        try{
            arr[a]="Task completed";
        }
        catch (ArrayIndexOutOfBoundsException aa){
            System.out.println("you entered wromg time slot");
        }
        System.out.println("time slot completed!!");
    }
    static void voting(){
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            if(age<19) System.out.println("not possible for voting");
            else System.out.println("possible for voting");
        }
        catch (InputMismatchException aa){
            System.out.println("ener age in interger fomat");
        }
    }
    static void length(String s){
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException aa){
            System.out.println("NULL String !!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1. calculator app
//        int a=sc.nextInt(),b=sc.nextInt();
//        exceptionhandling_task01.divide(a,b);

        //2. invalid list accss in to do list
//        System.out.println("enter  your task completed no.");
//        int a=sc.nextInt();
//        task(a-1);

        //3. Wrong Input for Age in Registration
//        System.out.println("checking age for voting");
//        voting();

        //4. NULL contact name in phonebook
//        String s=null;
//        length(s);

        //5.
    }
}
