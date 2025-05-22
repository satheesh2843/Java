package task;

import java.util.Scanner;

public class exceptionhandling_task01 {
    static void divide(int a, int b){
        try{
            System.out.println(a/b);

        }

        catch (ArithmeticException err){
            System.out.println(err);
        }
        finally {
            System.out.println("the finally condition is runnning!!!");
        }
        System.out.println("the ending!!");

    }
    static void sum(int a[]){
        int sum=0;
        try {
            for(int i=0;i<10;i++)
                sum+=a[i];
        }
        catch (Exception aa){
            System.out.println("it's shows an array index out of bound, would u check it master");
        }
        finally {
            System.out.println("finally condition is runnning");
        }
        System.out.println("the sum of the array elements is --> " + sum);
    }
    static  void strintt(String s){
        int p=0;
        try{
            p=Integer.valueOf(s);

        }catch (Exception aa){
            System.out.println("you enter wrong value");
        }
        finally {
            System.out.println("The finally condition is running");
        }
        System.out.println("you enter value of p is --> " +p);
    }
    static void strin(String s){
        try{
            s.toLowerCase();
            System.out.println(s);
        }
        catch (NullPointerException a){
            System.out.println("u converting null character to lowercase!!!!");
        }
        System.out.println("the converting uppercase to lowercase is done !!");



    }
    static void multiplecatch(){
        int a[]={12,123,432,5432,213,12,0,0,23,1};

        int aa=12,b=0;
        try{
            System.out.println(aa/b);
            System.out.println(a[100]);
        }
        catch (ArithmeticException bb){
            System.out.println("dividing 0");
        }
        catch (ArrayIndexOutOfBoundsException cc){
            System.out.println("array index out range");
        }

//        for(int i=0;i<a.length;i++){
//            try{
//                System.out.println(a[i]/a[i+1]);
//            }
//            catch (ArithmeticException aa){
//                System.out.println("u dividing '0' to another variable !! check the value");
//            }
//            catch (ArrayIndexOutOfBoundsException bb){
//                System.out.println("check the array size it excute out of range");
//            }
//            System.out.println();
//        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        // 1. dividing by zero handling
//        int a=sc.nextInt(),b=sc.nextInt();
//        divide(a,b);

        //2.  array index out odf bounds
//            int a[]={1,2,3,4,5,6};
//            sum(a);

//        3. string to integer coversion error
//        String s=sc.nextLine();
//        strintt(s);

        //4. Null pointer exception
//        String str=null;
//        strin(str);

        //5. Multiple catch block code;
        multiplecatch();
    }
}
