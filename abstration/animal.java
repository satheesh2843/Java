package abstration;

 abstract public class animal {
    abstract void sound();
}
class lion extends animal{
     void sound (){
         System.out.println("lion sound");
     }
}
class tiger extends animal{
    void sound (){
        System.out.println("tiger sound");
    }
}
class sounds{
    public static void main(String[] args) {
        lion obj=new lion();
        tiger obj1=new tiger();
        obj.sound();
        obj1.sound();
    }
}

