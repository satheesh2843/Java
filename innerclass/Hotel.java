package innerclass;

public class Hotel {
    static class Room{
        int rooms=34;
        String type="AC";
        void check(){
            System.out.println("room availabe-->"+rooms);
            System.out.println("room type-->"+type);
        }
    }

    public static void main(String[] args) {
        Hotel o=new Hotel();
        Hotel.Room obj=new Room();
        obj.check();
    }
}
