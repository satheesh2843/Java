package innerclass;

import java.util.Scanner;

interface Shapecal{
  void calculatearea(int area);
}
public class shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter square area");
        int n=sc.nextInt();
        Shapecal obj=new Shapecal() {
            public void calculatearea(int area) {
                System.out.println("area of square is--> "+area*area);
            }
        };
        obj.calculatearea(n);
    }
}
