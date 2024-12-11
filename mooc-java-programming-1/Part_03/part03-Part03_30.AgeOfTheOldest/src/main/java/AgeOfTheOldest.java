
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String sentence = "";
        while (true) {

            sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] words = sentence.split(",");
            if (Integer.valueOf(words[words.length - 1]) > oldest){
                oldest = Integer.valueOf(words[words.length - 1]);
            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
