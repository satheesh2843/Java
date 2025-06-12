package trail;

public class hi {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

class A{
    synchronized void method1(B ob2)
    {
        System.out.println("Method 1");
        ob2.method4();
    }
    synchronized void method2()
    {
        System.out.println("Method 2");
    }
}

class B{
    synchronized void method3(A ob1)
    {
        System.out.println("Method 3");
        ob1.method2();
    }
    void method4()
    {
        System.out.println("Method 4");
    }
}

class Thread21 extends  Thread{
    A ob1;
    B ob2;
    Thread21(A ob1,B ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void run()
    {
        ob1.method1(ob2);
    }
}

class Thread22 extends  Thread{
    A ob1;
    B ob2;
    Thread22(A ob1,B ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void run()
    {
        ob2.method3(ob1);
    }
}

class DeadLock{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread21 t1 = new Thread21(a,b);
        Thread22 t2 = new Thread22(a,b);

        t1.start();
        t2.start();
    }
}

class Tshirt{
    int tshirtCount = 20;

    synchronized void orderOfTshirt(int count)
    {
        if(tshirtCount >= count)
        {
            System.out.println("Order Successfully....");
            tshirtCount -= count;
            System.out.println("Balance T-shirt Count : " + tshirtCount);
        }
        else {
            System.out.println("Waiting.....");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            orderOfTshirt(count);
        }
    }
    synchronized void load(int count)
    {
        tshirtCount += count;
        System.out.println("Loaded Successfully....");
        System.out.println("After Loaded & total T-shirt Count : " + tshirtCount);
    }
}

class Shopping extends Thread{
    Tshirt ob;
    int count;

    Shopping(Tshirt ob,int count)
    {
        this.ob = ob;
        this.count = count;
    }


    public void run()
    {
        ob.orderOfTshirt(count);
    }
}

class TshirtLoad extends Thread{
    Tshirt ob;
    int count;

    TshirtLoad(Tshirt ob,int count)
    {
        this.count = count;
        this.ob = ob;
    }

    public void run()
    {
        ob.load(count);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main2{
    public static void main(String[] args) {
        Tshirt t = new Tshirt();

        Shopping s = new Shopping(t,50);
        s.start();

        TshirtLoad tsl = new TshirtLoad(t,100);
        tsl.start();
        System.out.println(s.getState());
    }
}