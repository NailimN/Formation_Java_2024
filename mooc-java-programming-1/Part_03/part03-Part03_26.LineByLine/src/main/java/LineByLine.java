
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "0";

        while (true) {

            sentence = scanner.nextLine();
            
            if (sentence.equals("")){
                break;
            }
            
            String[] words = sentence.split(" ");

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }

    }
}
