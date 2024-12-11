
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {

        String nameSearched = "";
        Scanner scanner = new Scanner(System.in);
        String result;

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        nameSearched = scanner.nextLine();
        result = nameSearched + " was not found!";
        while (true) {
            for (String name : list) {
                if (name.equals(nameSearched)) {
                    result = nameSearched + " was found!";
                    break;
                }
            }
            break;
        }
        System.out.println(result);
    }
}
