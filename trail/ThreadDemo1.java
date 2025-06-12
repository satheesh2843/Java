package trail;

public class ThreadDemo1 extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + ":" + i);
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            Thread.yield();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 ob = new ThreadDemo1();
        ThreadDemo1 ob1 = new ThreadDemo1();

//        ob.setPriority(10);
//        ob1.setPriority(1);

        ob.start();
        ob1.start();

        System.out.println(ob.isAlive());
        System.out.println(ob1.isAlive());

//        ob.join(1000);
//        ob1.join(1000);

        System.out.println(ob.getPriority());
        System.out.println(ob1.getPriority());
    }
}