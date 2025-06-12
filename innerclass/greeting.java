package innerclass;
interface greet1{
    void sayhello();
}
public class greeting {
    public static void main(String[] args) {
        greet1 obj=new greet1() {
            public void sayhello() {
                System.out.println("welcome to coding world!!!");
            }
        };
        obj.sayhello();
    }
}
