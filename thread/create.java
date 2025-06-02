package thread;

/* creating a thread in two ways namely.
    1. thread  --> class
    2. runnable --> interface
*/

// below process thread based creation..
public class create {

    public void run(){
        System.out.println("runnable state !!");
    }
    public static void main(String[] args) {
        create obj=new create();
//        obj.start();
    }

}

// runnable based creation


class create1 implements Runnable {

    // 2. "run()" --> to run the code .
    public void run()  {
        for (int i=0;i<10;i++){
            System.out.println("thread 2");

//            try{
//                Thread.sleep(1000);
//            }
//            catch (Exception e){
//                System.out.println("error");
//            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        create1 obj=new create1();
        Thread ob=new Thread(obj);

        // 1. "start"  --> to start the new thread
        ob.start();
        for (int i=0;i<10;i++){
            System.out.println("thread 1");
            //Thread.sleep(1000);
        }

        System.out.println(Thread.currentThread());
        /* it shows an

        Thread[#1,main,5,main] ==> explanation..👇
        Thread[#<id>,<name>,<priority>,<thread group>]

         */

        // 8. "getName" --> get the name of the thread .
        System.out.println(Thread.currentThread().getName());

        // 9. "setName" it helps to set the name of the thread.
        Thread.currentThread().setName("MainThread");
        System.out.println(Thread.currentThread().getName());

    }

}






