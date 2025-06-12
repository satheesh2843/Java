package trail;
class grandpa{
    void method(){
        System.out.println("grandpa class");
    }
    public static void main(String[] args) {

    }
}
public class inheritance  extends  grandpa{
    int a=10;
     void method(){
        System.out.println("hi hello");
         super.method();
    }
}
class single extends  inheritance{
    public static void main(String[] args) {
        inheritance obj=new inheritance();
        obj.method();
        System.out.println(obj.a);
    }
}