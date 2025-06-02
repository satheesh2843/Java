package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

    class user_students{
        String user_name;
        int rollnumber;
        int mark;
        user_students(String user_name,int rollnumber, int mark){
            this.mark=mark;
            this.rollnumber=rollnumber;
            this.user_name=user_name;
        }

        public String toString()
        {
            return user_name + " " + rollnumber + " " + mark+"\n";
        }

    }

    public static void main(String[] args) throws IOException {
        File obj=new File("C:\\course\\java codes\\filehandling\\students.txt");
        obj.createNewFile();


//        task --1
        FileWriter obj1=new FileWriter(obj);
        obj1.write("Name--> satheesh \n number --> 1224 \n marks--> 65");
        obj1.close();


//        task --2
        FileReader obj2=new FileReader(obj);
        int p;
        while((p=obj2.read())!=-1){
            System.out.print((char)p);
        }

//        task --3
        System.out.println();
        File obj3= new File("C:\\course\\java codes\\filehandling\\students.txt");
        System.out.println("file exists--> " +obj3.exists());
        if(obj3.exists())
            System.out.println("file path--> "+obj3.getAbsolutePath());


//        task --4
        Student o=new Student();
        Student.user_students name1=o.new user_students("satheesh", 154, 78);
        Student.user_students name2=o.new user_students("dhina", 155, 79);
        Student.user_students name3=o.new user_students("hari", 156, 80);

        FileWriter r=new FileWriter(obj);
        r.write(name1.toString());
        r.write(name2.toString());
        r.write(name3.toString());
        r.close();


//        file --5
        FileReader fr = new FileReader(obj);
        int ch;
        System.out.println("\nReading from file:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

    }
}
