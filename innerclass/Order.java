package innerclass;

public class Order {
    static class ShippingAddress{
        void print(){
            System.out.println("address print!!");
        }
    }

    public static void main(String[] args) {
        Order obj=new Order();
        Order.ShippingAddress obj1=new ShippingAddress();
        obj1.print();
    }
}
