package polymorphism;

public class overriding {
    // overriding is a " different class same method name and same arguments "
    String method(){
        return "parent class learning.method";
    }
}
class b{
    String method(){
        return "child class learning.method";
    }
    public static void main(String[] args) {
        overriding obj=new overriding();
        b obj1=new b();
        System.out.println(obj.method());
        System.out.println(obj1.method());
    }
}
