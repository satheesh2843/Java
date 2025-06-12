package inheritance;

public class agregation {
    String id;
    String name;
    char grade;
    int totalmark;
    static int p=100;
    agregation(String id, String name,char grade, int totalamrk){
        this.grade=grade;
        this.id=id;
        this.name=name;
        this.totalmark=totalamrk;
    }

    void display1(){
        System.out.println("class a method");
    }
}
class separatestudents{
    String id;
    String name;
    char grade;
    int totalmark;
    static  agregation reference_variable;

    separatestudents(String id, String n,char grade, int mark, agregation reference_variable){
        this.id=id;
        name=n;
        this.grade=grade;
        totalmark=mark;
        this.reference_variable=reference_variable;
    }

    void display(){
        System.out.println("id "+id +"\n"+ "name "+name);
        System.out.println(reference_variable.name);

    }
    public static void main(String[] args) {
        agregation object1=new agregation("21beece051","satheesh",'a', 499);
        separatestudents object2=new separatestudents("21","sarath",'a',90,object1);
        object2.display();
        object2.display();
        object1.display1();
        System.out.println(reference_variable.name);
//        System.out.println(reference_variable.p);
    }

}
