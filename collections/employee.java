package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class employee {
    String empname;
    int empid;
    double empsalary;
    employee(int empid, String empname,double empsalary){
        this.empname=empname;
        this.empsalary=empsalary;
        this.empid=empid;
    }



    public static void main(String[] args) {


        employee obj1=new employee(123,"satheesh",54000);
        employee obj2=new employee(125,"dhina",60000);
        employee obj3=new employee(127,"raja",70000);


        ArrayList<employee> obj=new ArrayList<>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        for(int i=0;i<obj.size();i++)
            System.out.println(obj.get(i).empid+obj.get(i).empname);


        LinkedList<employee> objt=new LinkedList<>();
        objt.add(obj1);
        objt.add(obj2);
        objt.add(obj3);
        for(int i=0;i<obj.size();i++)
            System.out.println(obj.get(i).empid);
    }
}

