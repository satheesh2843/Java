package thread;

public class ExtendsThreadclass {
    public static void main(String[] args) {
        Thread one =new Thread_one();
        Thread two=new Thread_two();
        one.start();
        two.start();
    }

}

class Thread_one extends Thread{
    public void run(){
        for(int i=0;i<15;i++)
            System.out.println("thread 1 running --> "+i);
    }
}

class Thread_two extends Thread{
    public void run(){
        for(int i=0;i<15;i++)
            System.out.println("thread 2 running --> "+ i);
    }
}