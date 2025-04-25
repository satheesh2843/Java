package inheritance;

public class Animal2 {
     void sound(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal2{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.sound();
    }
}
