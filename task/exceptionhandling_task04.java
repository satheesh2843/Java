package task;

import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(String s){
        super(s);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class exceptionhandling_task04 {
    static boolean check(int age) throws Exception{
        if(age<19) throw new UnderAgeException("your age id under 18!!");
        else if(age>120) throw new InvalidAgeException("invalid age are mentioned!!");
        return true;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age to check !!!");
        int age=sc.nextInt();
        if(check(age))
            System.out.println("valid age for voting");
    }
}
