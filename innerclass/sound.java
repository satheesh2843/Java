package innerclass;
abstract class Animal{
    abstract void makesound();
}
public class sound {
    public static void main(String[] args) {
        Animal obj=new Animal() {
            void makesound() {
                System.out.println("dog make sound woof!!!");
            }
        };
        obj.makesound();
    }
}
