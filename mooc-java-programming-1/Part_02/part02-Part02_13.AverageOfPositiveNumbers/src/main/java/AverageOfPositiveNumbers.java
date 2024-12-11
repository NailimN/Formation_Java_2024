
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");

            int n = Integer.valueOf(scanner.nextLine());

            if (n > 0) {
                sum = sum + n;
                counter++;
            } else if (n == 0) {
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / counter;
            System.out.println(average);
        }
    }
}
