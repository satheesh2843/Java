package inheritance;

public class Vehicle {
    static void move(){
        System.out.println("vehicles can movie");
    }
}
class Car extends Vehicle{
    static void car(){
        move();
    }

    public static void main(String[] args) {
        car();
    }
}
