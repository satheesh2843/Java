package trail;

class Web{
    synchronized void atm(String userName)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Processing Amount using atm : " + userName);
        }
    }
    synchronized void gpay(String userName)
    {
        System.out.println("Processing Amount using gpay : " + userName);
    }
}
class User extends Thread{
    Web ob;
    String name;

    User(Web ob,String name)
    {

        this.ob = ob;
        this.name = name;
    }
    public void run()
    {
        ob.atm(name);
        ob.gpay(name);
    }
}
public class Thread11 {
    public static void main(String[] args) {
        Web w1 = new Web();
        Web w2 = new Web();
        Web w3 = new Web();

        User u1 = new User(w1,"Suseendar");
        User u2 = new User(w2,"Logesh");
        User u3 = new User(w3,"Dinesh");

        u1.start();
        u2.start();
        u3.start();
    }
}
