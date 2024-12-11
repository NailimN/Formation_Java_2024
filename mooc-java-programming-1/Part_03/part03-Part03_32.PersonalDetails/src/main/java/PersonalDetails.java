
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumYears = 0;
        int nameCounter = 0;
        int longestNameLenght = 0;
        String longestName = "";
        String sentence = "";
        while (true) {

            sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] words = sentence.split(",");
            if (Integer.valueOf(words[0].length()) > longestNameLenght){
                longestNameLenght = words[0].length();
                longestName = words[0];
            }
            sumYears += Integer.valueOf(words[words.length - 1]);
            nameCounter++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumYears/nameCounter));
        
    }
}
