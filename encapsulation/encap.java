package encapsulation;

class employee{
    private String name;
    private int id;
    private double salary;
    employee(String name, int id , double salary){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}




public class encap {
    public static void main(String[] args) {
        employee obj=new employee("satheesh",51,50000);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
//        System.out.println(obj.getSalary());
//
//        System.out.println(obj.name);
//
        obj.setId(10);
//        obj.setName("karthi");
//        obj.setSalary(100000);
        System.out.println(obj.getId());
//        System.out.println(obj.getName());
//        System.out.println(obj.getSalary());
    }
}
