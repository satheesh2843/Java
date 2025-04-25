package inheritance;

public class animal {

    String eat(){
        return "it's eats grass";
    }
}
class Mammal extends animal {
    String walk() {
        return "it can able to walk";
    }
}
class Human extends Mammal{
    String speak(){
        return "human can speak";
    }

    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.speak());
        System.out.println(obj.eat());
        System.out.println(obj.walk());
    }
}