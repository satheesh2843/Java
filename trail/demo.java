package trail;

interface it{
    void method();
}

public class demo {
    private int accnumber=1234;

    class demo1{
        void print(){
            System.out.println(accnumber);
        }
    }
    void hello(){

        class hi{
            void print(){
                System.out.println("hello");
            }
        }

        hi obj2=new hi();
        obj2.print();

    }


    public static void main(String[] args) {
        demo obj=new demo();
        demo.demo1 obj1=obj.new demo1();

    }

}

class demo2 extends demo{
    public static void main(String[] args) {
//        System.out.println(s);
    }
}

