package innerclass;

abstract class messageformatter{
    abstract void format(String str);
}
public class message {
    public static void main(String[] args) {
        messageformatter obj=new messageformatter() {
            @Override
            void format(String str) {
                System.out.println(str.toUpperCase());
            }
        };
        obj.format("satheesh");
    }
}
