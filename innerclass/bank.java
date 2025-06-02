package innerclass;

public class bank {


    static class account{
        private double balance=37456;
        private int accountnumber=1023;
        void print(){
            System.out.println("balance --> "+balance);
            System.out.println("yours account number--> "+accountnumber);
        }
    }

    public static void main(String[] args) {
       bank obj=new bank();
       bank.account obj1=new bank.account();
       obj1.print();
    }
}
