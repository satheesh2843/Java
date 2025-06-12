package trail;

public class aa {
}
class a{
    synchronized void one(b obj){
        System.out.println("the first");
        obj.four();
    }
    synchronized void two(){
        System.out.println("the second");
    }
}
class b{
    synchronized void three(a obj){
        System.out.println("the three");
        obj.two();
    }
    void four(){
        System.out.println("the fourth");
    }
}

class Thread31 extends Thread{
    a ob1;
    b ob2;
    Thread31(a ob1,b ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void run()
    {
        ob1.one(ob2);
    }
}

class Thread32 extends Thread{
    a ob1;
    b ob2;
    Thread32(a ob1,b ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void run()
    {
        ob2.three(ob1);
    }
}

class main{
    public static void main(String[] args) {
        a obj1=new a();
        b obj2=new b();
        Thread31 t1 = new Thread31(obj1,obj2);
        Thread32 t2 = new Thread32(obj1,obj2);

        t1.start();
        t2.start();
    }
}

class Shirt{
    int shirtCount = 20;

    synchronized void orderOfShirt(int count)
    {
        if(shirtCount >= count)
        {
            System.out.println("Order Successfully");
            shirtCount -= count;
            System.out.println("Balance : " + shirtCount);
        }
        else {
            System.out.println("Waiting....");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            orderOfShirt(count);
        }
    }
    synchronized void loadShirt(int count)
    {
        shirtCount += count;
        System.out.println("Loaded Successfully!!!");
        System.out.println("After Loading Shirt count : " + shirtCount);
        notify();
    }
}

class ShirtOrder extends  Thread {
    int count;
    Shirt ob1;

    ShirtOrder(int count, Shirt ob1)
    {
        this.count = count;
        this.ob1 = ob1;
    }

    public void run()
    {
        ob1.orderOfShirt(count);
    }
}

class LoadShirt extends Thread{
    int count;
    Shirt ob1;
    LoadShirt(int count,Shirt ob1)
    {
        this.count = count;
        this.ob1 = ob1;
    }

    public void run()
    {
        ob1.loadShirt(count);
    }
}
class InterThread{
    public static void main(String[] args) {
        Shirt obj = new Shirt();

        ShirtOrder s1 = new ShirtOrder(50,obj);
        s1.start();

        LoadShirt l1 = new LoadShirt(100,obj);
        l1.start();
    }
}