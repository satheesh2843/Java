package innerclass;

interface onclicklistener{
    void onclick();
}
public class button {
    public static void main(String[] args) {
        onclicklistener obj=new onclicklistener() {
            @Override
            public void onclick() {
                System.out.println("button click successfully!!!");
            }
        };
        obj.onclick();
    }
}
