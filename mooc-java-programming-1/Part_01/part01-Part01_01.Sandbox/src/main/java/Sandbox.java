
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);

        numbers.remove(Integer.valueOf(2));
        
        for (Integer value : numbers){
            System.out.println(value);
        }
    }
    
    
}
