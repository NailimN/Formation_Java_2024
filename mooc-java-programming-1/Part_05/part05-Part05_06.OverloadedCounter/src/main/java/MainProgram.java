
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();
        
        counter1.decrease(12);
        counter1.decrease();
        
        counter2.increase(2);
        counter2.increase();
        
        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }
}
