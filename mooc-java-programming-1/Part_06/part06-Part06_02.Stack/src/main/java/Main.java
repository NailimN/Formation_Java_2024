
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        System.out.println(s.values());
        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
        
        System.out.println(s.values());
    }
}