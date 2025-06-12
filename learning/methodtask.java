package learning;

import java.util.*;

import static java.lang.Math.log10;

public class methodtask {
    int dd=10;
    String palindrom(int n){

        int p=n,x=0;

        while(p!=0){
            x=x*10+(p%10);
            p/=10;
        }
        if(n==x) return "its's a learning.palindrom number";
        else return "it's not a learning.palindrom number";
    }
    int sumofnumber(int n){
        int s=0;
        for(int i=1;i<=n;i++) s=s+ i;
        return s;
    }
    String prime(int n){
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) c++;
        }
        if(c==0) return "it's learning.prime number";
        else return "it's not a learning.prime number";
    }
    String armstring(int n){
        int l= (int) log10(n)+1;
        int nn=n,c=0;
        while(nn!=0){
            int x=nn%10,co=l,p=1;
            while(co!=0){
                p*=x;
                co--;
            }
            c+=p;
            nn/=10;
        }
        if(c==n)return "its a armstrong number";
        else return "it's not a armstrong number";
    }
    void numbertriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) System.out.print(i+1+" ");
            System.out.println();
        }
    }
    void numberincreasingpyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    void mirrortriangle(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            int p=n-i+1;
            for(int j=0;j<i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            int p=n-i+1;
            for(int j=0;j<i;j++){
                System.out.print(p+++" ");
            }
            System.out.println();
        }
    }
    void kpattern(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pascaltriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p*(i-j)/j;
            }
            System.out.println();
        }
    }
    void hellowsquarepatern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 || j==0 || i==n-1 || j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    void rightpascal(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void hellowdaimond(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi, What type of program do you needed?");
        System.out.println("---> 1.Pattern Coding\n---> 2.Numbers Coding");
        System.out.print("enter coding number :");
        int n=sc.nextInt();
        methodtask obj=new methodtask();
        switch (n){
            case 1:{
                System.out.println("hi friends, there is an two type of pattern in it.");
                System.out.println("--> 1. number pattern\n--> 2.star pattern");
                System.out.print("enter the pattern number:");
                int p=sc.nextInt();
                switch (p){
                    case 1:
                        System.out.println("number pattern types:\n1.number triangle\n 2. number increasing pyramid \n 3. mirror image triangle\n4. pascal's triangle");
                        System.out.print("enter pattern number:");
                        int a=sc.nextInt();
                        System.out.print("enter the value X :");
                        int val=sc.nextInt();
                        switch (a){
                            case 1:
                                obj.numbertriangle(val);
                                break;
                            case 2:
                                obj.numberincreasingpyramid(val);
                                break;
                            case 3:
                                obj.mirrortriangle(val);
                                break;
                            case 4:
                                obj.pascaltriangle(val);
                                break;
                            default:
                                System.out.println("sorry u entered wrong value");
                        }break;
                    case 2:
                        System.out.println("star pattern types:\n1.hollow square pattern\n 2. right pascal triangle pattern \n 3. hellow daimond pattern\n4. k patten");
                        System.out.print("enter pattern number:");
                        a=sc.nextInt();
                        System.out.print("enter the value X");
                        val=sc.nextInt();
                        switch (a){
                            case 1:
                                obj.hellowsquarepatern(val);
                                break;
                            case 2:
                                obj.rightpascal(val);
                                break;
                            case 3:
                                obj.hellowdaimond(val);
                                break;
                            case 4:
                                obj.kpattern(val);
                                break;
                            default:
                                System.out.println("sorry u entered wrong value");
                        }
                        break;
                    default:
                        System.out.println("Please enter correct number");
                }break;

            }

            case 2:{
                System.out.println("--> 1.armstrong number \n--> 2. learning.palindrom number\n --> 3.learning.prime number\n --> 4. learning.sum of numbers");
                System.out.print("enter number of coding :");
                int a=sc.nextInt();
                System.out.print("enter the value X :");
                int val=sc.nextInt();
                switch (a){
                    case 1:
                        String k= obj.armstring(val);
                        System.out.print(k);
                        break;
                    case 2:
                        String pal=obj.palindrom(val);
                        System.out.print(pal);
                        break;
                    case 3:
                        String pri=obj.prime(val);
                        System.out.print(pri);
                        break;
                    case 4:
                        System.out.print(obj.sumofnumber(val));
                        break;
                    default:
                        System.out.println("sorry u entered wrong value");
                } break;
            }
            default:
                System.out.println("Please enter correct number");
        }
    }
}
