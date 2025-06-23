package Project1;
import java.io.*;
import java.util.Scanner;
class InvalidDegreeMEntion extends Exception{
    InvalidDegreeMEntion(String s){
        super(s);
    }
}
class Invalid_MARK_mention extends Exception{
    Invalid_MARK_mention(String s){
        super(s);
    }
}
abstract class Studentdetails{
    abstract void Addstudent(String degree, String StudentName, int mark);
    abstract void display();
}

class Student extends Studentdetails{
    protected String Studentdegree[]=new String[100];
    protected String Studentname[]=new String[100];
    protected int Studentmark[]=new int[100];
    protected int Studentid[]=new int[100];
    int index=1;
    void display(){
        System.out.println("StudentId\tStudent Name\tStudent Degree\t Student Mark");
        for(int i=1;i<index;i++){
            if(Studentdegree[i].equals("UG"))
                System.out.println(Studentid[i]+"\t\t"+Studentname[i]+"\t\t"+Studentdegree[i]+"\t\t"+Studentmark[i]);
        }
        for(int i=1;i<index;i++){
            if(Studentdegree[i].equals("PG"))
                System.out.println(Studentid[i]+"\t\t"+Studentname[i]+"\t\t"+Studentdegree[i]+"\t\t"+Studentmark[i]);
        }
    }
    void Addstudent(String degree, String Name, int mark){
        Studentdegree[index]=degree;
        Studentname[index]= Name;
        Studentmark[index]=mark;
        Studentid[index]=index;
        index++;
    }
    void file() throws IOException {
        File f=new File("C:\\course");
            f.mkdir();
            File f1 = new File("C:\\course\\File1.txt");
            f1.createNewFile();
            FileWriter fw1 = new FileWriter(f1);
            fw1.write("Student ID\t Student Name\t Student degree\t Student Mark\n");
            for(int i=1;i< index;i++)

                if(Studentdegree[i].equals("UG"))
                fw1.write(Studentid[i]+"\t"+Studentname[i]+"\t"+Studentdegree[i]+"\t"+Studentmark[i]+"\t"+"\n");
            for(int i=1;i<index;i++)
                if(Studentdegree[i].equals("PG"))
                    fw1.write(Studentid[i]+"\t"+Studentname[i]+"\t"+Studentdegree[i]+"\t"+Studentmark[i]+"\t"+"\n");
            fw1.close();
    }
    void read() throws IOException {
        FileReader fr1 = new FileReader("C:\\course\\File1.txt");
        int a;
        while((a = fr1.read()) != -1)
        {
            char b = (char)a;
            System.out.print(b);
        }
        fr1.close();
    }
    void search(String s){
        int p=0,k=0;
        System.out.println("Please Wait searching!!!");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("hi");
        }
        for(int i=1;i<index;i++){
            p=0;
            if(Studentname[i].equals(s)){
                p=1;
                k++;
            }
            if (k==1){
                System.out.println("The result founded successfully\nStudentId\tStudentName\tStudentDegree\tStudentMark");
                k++;
            }
            if(p==1){
                System.out.println(Studentid[i]+"\t"+Studentname[i]+"\t"+Studentdegree[i]+"\t"+Studentmark[i]);
            }
        }
        if(k==0) System.out.println("No result founded");
    }
    void search(int p){
        int pp=0,k=0;
        System.out.println("Please Wait searching!!!");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("hi");
        }
        for(int i=1;i<index;i++){
            pp=0;
            if(Studentmark[i]==p){
                pp=1;
                k++;
            }
            if (k==1){
                System.out.println("The result founded successfully\nStudentId\tStudentName\tStudentDegree\tStudentMark");
                k++;
            }
            if(pp==1)
                System.out.println(Studentid[i]+"\t"+Studentname[i]+"\t"+Studentdegree[i]+"\t"+Studentmark[i]);

        }
        if(k==0) System.out.println("No result founded");
    }

}
class Ug {
    Student ob;
    Ug(Student ob){
        this.ob=ob;
    }
    void Addstudent(String degree, String Name, int mark){
        ob.Addstudent("UG", Name, mark);
    }
}
class Pg{
    Student ob;
    Pg(Student ob){
        this.ob=ob;
    }
    void Addstudent(String degree, String Name, int mark){
        ob.Addstudent("PG", Name, mark);
    }
}
class StudentManagementSystem extends Student{
    public static void main(String[] args) throws Exception {

        Student obj1=new Student();
        Ug obj2=new Ug(obj1);
        Pg obj3=new Pg(obj1);
        System.out.println("Hi, We have multiple option to perform student details updates");
        System.out.print("1. Add student \n2. Search Student \n3. Diplay student detials \n4.Save file\n5.Show file data\n6. Exit\n\nYour choise--> ");
        Scanner sc=new Scanner(System.in);

        while (true){
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("If you like to add a student!! \n\t !!! Mention the degree UG or PG !!! ");
                String degree=sc.next();
                if(degree.equalsIgnoreCase("UG")){
                    System.out.print("Enter Student name --> ");
                    String name=sc.next();
                    System.out.print("Enter UG mark of "+name+" --> ");
                    int mark=sc.nextInt();
                    if(mark<0 || mark>100) throw new Invalid_MARK_mention("!! INVALID MARK !!!");
                    obj2.Addstudent("UG",name,mark);
                }
                else if(degree.equalsIgnoreCase("pG")){
                    System.out.print("Enter Student name --> ");
                    String name=sc.next();

                    System.out.print("Enter PG mark of "+name+" --> ");
                    int mark=sc.nextInt();
                    if(mark<0 || mark>100) throw new Invalid_MARK_mention("!! INVALID MARK !!!");
                    obj3.Addstudent("PG",name,mark);
                }
                else{
                    throw new InvalidDegreeMEntion("INVALID DEGREE MENTION !!!");
                }
            }

            else if(choice ==2){
                System.out.println("Enter name or mark to search");
                String indetify=sc.next();
                try{
                    int p=Integer.parseInt(indetify);
                    obj1.search(p);
                }catch (NumberFormatException e){
                    obj1.search(indetify);
                }
            }
            else if(choice==3) obj1.display();

            else if(choice==4) obj1.file();

            else if(choice==5) obj1.read();

            else if (choice==6) break;

            else
                System.out.println("\t\t--- !!!you entered wrong option!!! ---");

            System.out.print("\n\n1. Add student \n2. Search Student \n3. Diplay student detials \n4.Save file\n5.Show file data\n6. Exit\n\nYour choise--> ");
        }
        System.out.println("\t\t !!! Student Management Completed !!!");
    }
}