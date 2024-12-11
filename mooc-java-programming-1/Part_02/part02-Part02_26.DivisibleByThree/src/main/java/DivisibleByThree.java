
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 18);
    }
    
    public static void divisibleByThreeInRange(int n1, int n2){
        
        for (int i = n1; i < n2 + 1; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
