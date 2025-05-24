package innerclass;

public class car {
    class engine{
        void engine_detais(){
            System.out.println("the engine details are shown...");
        }
    }
    static void car_details(){
        System.out.println("the car details..");
    }
    public static void main(String[] args) {
        car c1=new car();
        car.engine obj=c1.new engine();
        obj.engine_detais();
        car_details();
    }

}
