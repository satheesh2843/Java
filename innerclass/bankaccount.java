package innerclass;
import java.util.*;
import java.time.LocalTime;
public class bankaccount {
    private double amt=27589;
    void processtransaction(){

        class transactionlog{
            void print(){
                LocalTime  time=LocalTime.now();
                System.out.println("login successfull"+"\n"+"login time-->"+time+"\nBalance amount of your account "+amt);

            }
        }
        transactionlog obj1=new transactionlog();
        obj1.print();
    }
    public static void main(String[] args) {
        bankaccount obj=new bankaccount();
        obj.processtransaction();
    }
}
