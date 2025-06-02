package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args)  throws IOException {

        File f=new File("C:\\Users\\sathi\\satheesh");
        f.mkdir();

        File f1 = new File("C:\\Users\\sathi\\satheesh\\File1.txt");
        f1.createNewFile();

        FileWriter fw1 = new FileWriter(f1);
        fw1.write("Java Program");
        fw1.close();

        FileReader fr1 = new FileReader(f1);

        int a;
        while((a = fr1.read()) != -1)
        {
            char b = (char)a;
            System.out.print(b);
        }

        fr1.close();
        Scanner sc = new Scanner(f1);
        while (sc.hasNext()){
            System.out.print(sc.next() + " ");
        }
        sc.close();
        File f2 = new File("C:\\Users\\sathi\\satheesh\\File.2txt");
        System.out.println("file exists-->"+f2.exists());
    }
}
