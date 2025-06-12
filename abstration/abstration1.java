package abstration;

abstract class one{
    int a=20;
    abstract void method();
    one(){
        System.out.println("parent class learning.constructor  --- wee can't create an object in abstract class");
    }
    void two(){
        System.out.print("parent class learning.method without abstract--- calling this learning.method using super keyword");
    }
    void three(){
        System.out.println("call this learning.method in child class main learning.method");
    }
}

class abstration1 extends one{

    void method() {
        System.out.println("we using abstract learning.method in child class, it's compulsory ");
        super.two();
    }
    abstration1(){
        System.out.println("creating an child class learning.constructor");
    }

    public static void main(String[] args) {
        abstration1 obj=new abstration1();
        obj.three();
        obj.method();
    }

}
