package inheritance;

public class agg {
    int id;
    static String name; // Removed static

    public static void main(String[] args) {
        agg one = new agg();
        one.id = 10;
        one.name = "Satheesh";

        agg onee = new agg();
        onee.id = 11340;
        onee.name = "Sathedfgfdvdsvsdvesh";

        sub two = new sub(one); // Pass agg object to sub
    }
}

class sub {
    agg vari;

    sub(agg vari) {
        this.vari = vari;
    }

    public static void main(String[] args) {
        agg one = new agg();
        sub two = new sub(one);

        agg onee = new agg();
        sub twoo = new sub(onee);
        // create sub object with aggregation
        System.out.println("ID: " + onee .id);
        System.out.println("Name: " +agg.name);
    }
}
