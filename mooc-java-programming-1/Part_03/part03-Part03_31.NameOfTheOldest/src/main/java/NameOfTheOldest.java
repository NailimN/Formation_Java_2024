
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String nameOldest = "";
        String sentence = "";
        while (true) {

            sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] words = sentence.split(",");
            if (Integer.valueOf(words[words.length - 1]) > oldest){
                oldest = Integer.valueOf(words[words.length - 1]);
                nameOldest = words[0];
            }

        }
        System.out.println("Name of the oldest: " + nameOldest);
        
    }
}
