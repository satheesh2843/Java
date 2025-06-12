package interfacetask;

import java.util.Scanner;

interface shape{
    void calarea();
    void calperi();
}
public class circle implements shape{
    int r;
    circle(int r){
        this.r=r;
    }
    public void calarea(){
        System.out.println(r*r*3.14);
    }
    public void calperi(){
        System.out.println(2*3.14*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter readius of circle :");
        int r=sc.nextInt();
        circle obj=new circle(r);
        obj.calarea();
        obj.calperi();
    }
}
class rectangle implements shape{
    int l,b;
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void calarea(){
        System.out.println(l*b);
    }
    public void calperi(){
        System.out.println(2*(l+b));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter len and height");
        int l=sc.nextInt();
        int b=sc.nextInt();
        rectangle obj=new rectangle(l,b);
        obj.calarea();
        obj.calperi();
    }
}
