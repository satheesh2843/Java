package trail;

public class two {
     void print(){
        System.out.println("hello");
    }
}
class three extends two{
     void print(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
         three obj=new three();
        obj.print();
    }
}
