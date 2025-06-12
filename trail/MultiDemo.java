package trail;

public class MultiDemo extends Thread {
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("First Thread");
//            Thread.currentThread().setName("First Thread!!!!!");
//            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MultiDemo ob = new MultiDemo();
//        System.out.println(ob.getState());
        ob.start(); // Create a new thread
//        System.out.println(ob.getState());

        for(int i=1;i<=3;i++)
        {
            System.out.println("Main Thread");
        }

        System.out.println(ob.getState());
        System.out.println(ob.getName());
        Thread t1 = new Thread("Second Thread");
        System.out.println(t1.getName());
        t1.setName("2 Thread");
        System.out.println(t1.getName());

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Root Thread");
        System.out.println(Thread.currentThread().getName());

        System.out.println(ob.getState()+"--");

//        int a = 10/0;
    }
}

class Thread2 extends Thread{
    Thread2(String name)
    {
        super(name);
    }
      public void run()
      {
          for(int i=1;i<=3;i++)
          {
              System.out.println("Second Thread");
          }
      }
}


class Thread1 extends Thread{

    Thread1(String name)
    {
        super(name);
    }
//    public void run()
//    {
//        for(int i=1;i<=3;i++)
//        {
//            System.out.println("First Thread");
//        }
//    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("New Thread-1");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        System.out.println(t1.getName());

        Thread2 t2 = new Thread2("New Thread-2");
        System.out.println(t2.getName());
        t2.start();
    }
}


class Thread3 implements Runnable{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Runnable Interface");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        Thread3 ob = new Thread3();

        Thread t1 = new Thread(ob,"Runnable Thread-1");
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getState());

        for(int i=1;i<=3;i++)
        {
            System.out.println("Main Thread");
        }
        System.out.println(t1.getState()+"-->");
    }
}

