package thread;
// creating a thread using Runnable interface --> one type
public class runnable  {
    public static void main(String[] args) {
        Thread one =new Thread(new Thread_1());
        Thread two =new Thread(new Thread_2());
        Thread three=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<15;i++)
                System.out.println("thread 3 --> "+ i);
            }
        });
        one.start();
        two.start();
        three.start();

    }
}
class Thread_1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("thread 1 --> "+ i);
    }
}
class Thread_2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("thread 2 --> "+ i);
    }
}
