package bank;

import java.util.Scanner;

class accountdetails{
    static int no=3;
    static  int accountnumber[]=new int[1000];

    static  String name[]=new String[1000];
    static  double amount[]=new double[1000];
    public int[] getAccountnumber(){
        return accountnumber;
    }
    public String[] getname(){
        return name;
    }
    public double[] getamount(){
        return amount;
    }
    static void add(int i,double accamount,String accname,int accnumber){
        accountnumber[i]=accnumber;
        name[i]=accname;
        amount[i]=accamount;

    }

    public static void main(String[] args) {
        accountnumber[0]=100;
        accountnumber[1]=101;
        accountnumber[3]=102;
        name[0]="susendran";
        name[1]="jeeve";
        name[2]="satheesh";
        amount[0]=10000;
        amount[1]=20000;
        amount[2]=123213;
    }
}
class bankaccount extends accountdetails {

     static boolean check(int x,int ii,int find){
         accountdetails obj1=new accountdetails();
         int []arr=obj1.getAccountnumber();
         for(int i=0;i<ii;i++){
             if(arr[i]==x){
                 find=i;
                 return true;
             }
             System.out.println(i+" "+arr[i]+" "+x);
         }
         return false;
     }
    static void showname(int ii){
        accountdetails obj1=new accountdetails();
        String []arr=obj1.getname();
        System.out.println(arr[ii]);
    }
    static void showbalance(int ii){
        accountdetails obj1=new accountdetails();
        double []arr=obj1.getamount();
        System.out.println(arr[ii]);
    }
    static void deposit(int amount,int ii){
        accountdetails obj1=new accountdetails();
        double []arr=obj1.getamount();
        arr[ii]+=amount;
    }
    void add(){
        System.out.println("hi");
    }
    static void withdraw(int amount,int ii){
        accountdetails obj1=new accountdetails();
        double []arr=obj1.getamount();
        if(arr[ii]<amount){
            System.out.println("you dont have enough money");

        }
        else{
            arr[ii]-=amount;
        }

    }
}
public class bankk extends bankaccount {
    static int ii=3;
    static int find;
    static int index=3;
    static int acnumber=104;
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bankk obj=new bankk();
        accountdetails objj=new accountdetails();
        System.out.println("enter your account number!!!");
        int x=sc.nextInt(),breakk=1;
        while(breakk!=0) {
            if (check(x, ii,find)) {
                showname(find);
                showbalance(find);
                System.out.println("Press the below optoion \n --> 1. deposit \n --> 2. withdraw \n 3. checkbalance \n 4. quit");
                int p = sc.nextInt(), amo;
                switch (p) {
                    case 1:
                        System.out.println("enter your amount to deposit");
                        amo = sc.nextInt();
                        deposit(amo, find);
                        System.out.println("yours balance amount");
                        showbalance(find);
                        break;

                    case 2:
                        System.out.println("enter your amount to withdraw");
                        amo = sc.nextInt();
                        withdraw(amo, find);
                        System.out.println("yours balance amount");
                        showbalance(find);
                    case 3:
                        showname(find);
                        showbalance(find);
                        break;
                    case 4:
                        System.out.println("thank you for visiting sk bank");
                        breakk=0;
                        break;
                    default:
                        System.out.println("you enter wrong option");
                }
            } else {
                System.out.println("sorry sir/madam your account not found");
                System.out.println("if u want to add bank account to sk bank \n please enter --> 1 \n otherwise enter --> 0");
                int ad = sc.nextInt();
                if (ad == 1) {
                    System.out.println("enter your name");
                    String acname = sc.next();
                    System.out.println("enter how much amount do u deposit");
                    double acamount = sc.nextDouble();
                    ii++;
                    objj.add(index++, acamount, acname, acnumber++);

                } else {
                    breakk=0;
                    System.out.println("thankyou for your visit sk bank");
                }
            }
        }
    }
}