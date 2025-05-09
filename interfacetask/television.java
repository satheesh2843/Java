package interfacetask;
interface remotecontrrol{
    void poweron();
    void poweroff();
    void volumeup();
    void volumedown();
    void channelchange();
}
public class television {
    public void poweron(){
        System.out.println("poweroff");
    }
    public void poweroff(){
        System.out.println("poweron");
    }
    public void volumeup(){
        System.out.println("volumeupp");
    }
    public void volumedown(){
        System.out.println("voulmedown");
    }
    public void channelchange(){
        System.out.println("channel change successflly");
    }

    public static void main(String[] args) {
        television obj=new television();
        obj.poweron();
        obj.poweroff();
        obj.volumeup();
        obj.volumedown();
        obj.channelchange();
    }
}
