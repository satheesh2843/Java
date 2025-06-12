package task;
interface alert{
    void trigger();
}
public class notification {
    class email{
        void send (){
            System.out.println("email sent to user@gmail.com");
        }
    }
    void showlocalnotification(){
        class localmessage{
            void print(){
                System.out.println("this is a loacl notification.");
            }
        }
        localmessage obj=new localmessage();
        obj.print();
    }

    public static void main(String[] args) {
        notification obj=new notification();
        notification.email obj1=obj.new email();
        alert obj2=new alert() {
            @Override
            public void trigger() {
                System.out.println("anonymouss alert triggered.");
            }
        };
        obj1.send();
        obj.showlocalnotification();
        obj2.trigger();
    }
}
