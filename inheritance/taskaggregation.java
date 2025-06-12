package inheritance;

public class taskaggregation {
    String store_name;
    int oil_price;
    int rice_price;
    taskaggregation(int a, int b){
        oil_price=a;
        rice_price=b;
    }
}
class person1{
    String name;
    int oil1;
    int rice1;
    taskaggregation obj;
    person1(String name, int oil1, int rice1,taskaggregation obj){
        this.name=name;
        this.oil1=oil1;
        this.rice1=rice1;
        this.obj=obj;
    }
    void display(){
        System.out.println("name ->"+ name);
        System.out.println("oil price "+oil1*obj.oil_price);
        System.out.println("Rice price "+ rice1*obj.rice_price);

    }

    public static void main(String[] args) {
        taskaggregation object1=new taskaggregation(100,1000);
        person1 object2=new person1("satheesh",2, 5,object1);
        object2.display();
    }
}
