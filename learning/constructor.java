package learning;

import java.util.*;
public class constructor {
    int rollnumber;
    String name;
    String department;
    constructor(){
        System.out.println("one");
    }
    constructor(int n){
        this();
        System.out.println("two");
    }
    constructor(String name){
        this(2);
        System.out.println(name);
        System.out.println("three");
    }
    constructor(int roll,String name, String department){
        this("hello");
        rollnumber=roll;
        this.name=name;
        this.department=department;
        System.out.println("four");


    }
    void display(){
        System.out.print(rollnumber+name+department);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        constructor obj=new constructor(21, "satheesh","ece");
        constructor obj1=new constructor(22, "rahul","ece");
        constructor obj2=new constructor(23, "sarath","ece");
        constructor obj3=new constructor(24, "sasi","ece");
        constructor obj4=new constructor(25, "jeeeva","ece");
        obj.display();

    }
}
