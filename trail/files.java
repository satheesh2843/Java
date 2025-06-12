package trail;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class files {
    public static void main(String[] args)throws Exception {

        File f=new File("C:\\course\\java codes\\filehandling\\demo.txt");
        f.createNewFile();

        FileWriter w=new FileWriter(f);
        w.write("hello");
        w.close();

        FileReader r=new FileReader(f);

        int p;


    }
}
