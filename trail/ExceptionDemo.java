package trail;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Welcome");
        try {
            int a = 10 / 0;
            System.out.println(a);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        try {
            int a[] = {1, 2, 3};
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        try {
            String s1 = "Welcome";
            System.out.println(s1.charAt(10));
        }catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        try{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

    } catch (InputMismatchException e)
        {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}

class Exception1{
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
            int b[] = {1,2,3};
            System.out.println(b[10]);
            String s1 = "welcome";
            System.out.println(s1.charAt(10));
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("\n");

        try {
            try{
                try{
                    String s1 = "welcome";
                    System.out.println(s1.charAt(10));
                }catch (StringIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
                int b[] = {1,2,3};
                System.out.println(b[10]);
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            int a = 10 / 0;
            System.out.println(a);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Closing Resources!!!");
        }
    }
}