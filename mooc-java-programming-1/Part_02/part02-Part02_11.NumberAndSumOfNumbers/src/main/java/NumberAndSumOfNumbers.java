
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            
            int n = Integer.valueOf(scanner.nextLine());
            
            
            if (n != 0){
                sum = sum + n;
                counter++;
            } else if (n == 0) {
                break;
            }   
        }
        
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}
