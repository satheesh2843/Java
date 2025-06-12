package learning;

class A{
    int a;
    int b;
}
class B{
    A obj=new A();
    B(){
        obj.a=10;
        obj.b=20;
    }

}
class C{
    B objb=new B();
    int c;
    C(){
        c=objb.obj.a+objb.obj.b;
    }
}
class class1{
    class1(){
        C k=new C();
        System.out.print(k.c);
    }

    public static void main(String[] args) {
        class1 ok=new class1();
    }
}

