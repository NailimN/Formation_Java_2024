
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

        Money a = new Money(10, 20);
        Money b = new Money(5, 45);

        Money c = a.minus(b);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);
    }

}
