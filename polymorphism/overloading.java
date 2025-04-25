package polymorphism;

public class overloading {

    // overloading is an "same class -- same method name -- but different arguments"

    int hello(){
        System.out.println("no argumennt");
        return 0;
    }
    int hello(int a){
        System.out.println("one argument");
        return 0;
    }
    String hello(int a, String k){

        return "two arguments";
    }

    public static void main(String[] args) {
        overloading obj=new overloading();
       obj.hello();
       obj.hello(10);
        System.out.println(obj.hello(10,"hi"));
    }
}
