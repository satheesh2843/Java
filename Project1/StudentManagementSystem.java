package Project1;

import java.util.*;

class Student extends Studentdetails{
//    int id;
//    int mark;
//    Student(int id, String name,int mark){
//        this.id=id;
//        this.name=name;
//        this.mark=mark;
//    }
    ArrayList<String> name=new ArrayList<String>();
    ArrayList<Integer> mark=new ArrayList<Integer>();
    void addStudent(String name, int id, int mark){

    }


    void displayStudents(){

    }
}
abstract class Studentdetails{
    abstract void addStudent(String name, int id, int mark);
    abstract void displayStudents();
}
public class StudentManagementSystem {

    public static void main(String[] args) {

    }
}
