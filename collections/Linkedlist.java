package collections;

import java.util.LinkedList;
import java.util.Objects;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> name=new LinkedList<>();

        name.add("satheesh");
        name.add("dhina");
        name.add("jp");
        name.add("nithesh");
        name.add("manty");
        name.add("karthi");
        name.add("pradeep");
        System.out.println(name);

        LinkedList<String> extra=new LinkedList<>();
        extra.add("santhosh");
        name.addAll(extra);

        System.out.println(name);
        extra.clear();
        System.out.println(extra);

        extra= (LinkedList<String>) name.clone();
        System.out.println(extra);

        System.out.println(name.contains("satheesh"));

        System.out.println(name.element());

        System.out.println(name.indexOf("satheesh"));

        name.offer("offer");
        System.out.println(name);

        System.out.println(name.peek());
        System.out.println(name);

        System.out.println(name.poll());
        System.out.println(name);

        name.push("spark");
        System.out.println(name);

//        System.out.println(name.pop());

        name.remove("offer");
        name.remove(5);
        System.out.println(name);

        Objects array[]= (Objects[]) name.toArray();

        for(Objects p:array){
            System.out.println(p);
        }
    }
}
