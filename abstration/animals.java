package abstration;

abstract public class animals {
    abstract void eat();
    abstract void sleep();

}
class lions extends animals{
    void eat(){
        System.out.println("lions eats deer");
    }
    void sleep(){

    }
}
class deer extends animals{
    void eat(){

    }
    void sleep(){

    }
}
class tigers extends animals{
    void eat(){

    }
    void sleep(){

    }
}