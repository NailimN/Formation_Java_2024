
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        int counter = 0;
        while(true){
            System.out.println("Give a number:");
            
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n < 0){
                counter ++;
            } else if (n == 0) {
                break;
            }   
        }
        
        System.out.println("Number of negative numbers: " + counter);
    }
}
