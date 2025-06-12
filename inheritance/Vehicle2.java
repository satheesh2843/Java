package inheritance;

public class Vehicle2 {
    static int speed=200;
    static int displayspeed(){
        System.out.println(speed);
        return 0;

    }
}
class Car1 extends Vehicle2{
    static String brand="SUV";
}
class Sportscar extends Car1{
    int horsepower=100;
    Sportscar(){
        System.out.println(horsepower);
        System.out.println(brand);
        System.out.println(displayspeed());
    }
    public static void main(String[] args) {
        Sportscar obj=new Sportscar();
    }
}
