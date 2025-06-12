package innerclass;

public class Car_manu {
    static class Engine{
        int horse_power=2000;
        String type="fuel engine";
        void print(){
            System.out.println("engine deatils");
            System.out.println("horsepower-->"+horse_power);
            System.out.println("type of engine-->"+type);
        }
    }

    public static void main(String[] args) {
        Car_manu obj=new Car_manu();
        Car_manu.Engine obj1=new Engine();
        obj1.print();
    }
}
