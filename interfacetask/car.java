package interfacetask;
interface vehicle{
    void start();
    void stop();
    void accelerate();
    void brake();
    void honk();
}
public class car implements vehicle {
    public void start(){
        System.out.println("car eengine started!!!");
    }
    public void stop(){
        System.out.println("car engine stopped");
    }
    public void accelerate(){
        System.out.println("car accelerated");
    }
    public void brake(){
        System.out.println("car brake");
    }
    public void honk(){
        System.out.println("car honk");
    }
    public static void main(String[] args) {
        car obj=new car();
        obj.start();
        obj.accelerate();
        obj.brake();
        obj.honk();
        obj.stop();
    }
}
class bike implements vehicle {
    public void start(){
        System.out.println("bike eengine started!!!");
    }
    public void stop(){
        System.out.println("bike engine stopped");
    }
    public void accelerate(){
        System.out.println("bike accelerated");
    }
    public void brake(){
        System.out.println("bike brake");
    }
    public void honk(){
        System.out.println("bike honk");
    }
    public static void main(String[] args) {
        bike obj=new bike();
        obj.start();
        obj.accelerate();
        obj.brake();
        obj.honk();
        obj.stop();
    }
}
