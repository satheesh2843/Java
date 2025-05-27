package innerclass;

public class house {

    private class room{
        void room_no(){
            System.out.println("the room number is 7");
        }
    }
    static void show(){
        house obj1=new house();
        room obj=obj1.new room();
        obj.room_no();
    }
    public static void main(String[] args) {

        show();
    }
}
