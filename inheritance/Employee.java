package inheritance;

public class Employee {
    String work(){
        return "calling an employee work!!!   ";
    }
}
class Manager extends Employee {
    String manage() {
        return "calling an manager  " + work();
    }
    public static void main(String[] args) {
        Manager obj=new Manager();
        System.out.println(obj.manage());
        System.out.println(obj.work());
    }
}
class Engineer extends Employee{
    String engineer(){
        return "calling an engineer  "+ work();
    }

    public static void main(String[] args) {
        Engineer obj=new Engineer();
        System.out.println(obj.engineer());
        System.out.println(obj.work());
    }
}
