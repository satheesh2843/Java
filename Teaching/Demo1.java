package Teaching;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\course\\ByteFile.txt");
        FileOutputStream fous = new FileOutputStream(f1);
        fous.write(65);
        fous.close();
        System.out.println("Successfully Written");
        FileInputStream fis = new FileInputStream(f1);
        int i = fis.read();
        System.out.println((char)i);

        String s1 = "Welcome to Java class";

        byte b[] = s1.getBytes();

        FileOutputStream fous1 = new FileOutputStream(f1);
        fous1.write(b);
        fous1.close();
        System.out.println("Success");

        FileInputStream fis1 = new FileInputStream(f1);

        int i1=0;
        while ((i1 = fis1.read()) != -1)
        {
            System.out.print((char)i1);
        }
        fis1.close();
    }
}