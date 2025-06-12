package task;

import java.util.Scanner;
class PrerequisiteNotMetException extends Exception{
    PrerequisiteNotMetException(String s){
        super(s);
    }
}
class CourseFullException extends Exception{
    CourseFullException(String s){
        super(s);
    }
}
public class exceptionhandling_task05 {
    static int members=29;
    static int limit=30;
    static boolean checks(String s)throws Exception{
        if(!(s.equals("yes"))) throw new PrerequisiteNotMetException("u want to complete the Prerequisite course to join!!");
        else if(members>limit) throw new CourseFullException("cousre full!!") ;
        return true;

    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name to register the course!!");
        String name=sc.nextLine();
        System.out.print(name +"  would u completed the prerequisite course \nEnter yes or no!! --->");
        String check=sc.next();
        check=check.toLowerCase();members++;
        if(checks(check)) System.out.println("course successfully registered!!!");

    }
}
