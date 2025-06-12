package innerclass;

import javax.swing.plaf.IconUIResource;

public class computer {
    static String com_name="lenovo";

    class processor{
        void change(String c){
            com_name=c;
        }
        void display(){
            System.out.println(com_name);
        }
    }

    public static void main(String[] args) {
        computer obj=new computer();
        processor obj1=obj.new processor();
        obj1.change("dell");
        obj1.display();
    }
}
