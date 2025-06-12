package innerclass;

public class university {

    class department{
        static void print(String dep_name){

            System.out.println(dep_name);
        }
    }
    void call(){
        department obj1=new department();
        department.print("ECE");
    }
    public static void main(String[] args) {
        university obj=new university();
        obj.call();
    }
}
