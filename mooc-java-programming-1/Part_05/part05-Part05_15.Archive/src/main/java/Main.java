
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {

            System.out.println("Identifier (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(identifier, name);
            items.add(item);

        }
        
        System.out.println("==Items==");
        ArrayList<Item> itemsOriginal = new ArrayList<>();
        
        for (Item itemIndex1 : items) {
            int counter = 0;
            for (Item itemIndex2 : itemsOriginal) {
                if (itemIndex2.getIdentifier().equals(itemIndex1.getIdentifier())) {
                    counter++;
                    break;
                }
            }
            if (counter == 0){
                itemsOriginal.add(itemIndex1);
            }
        }
        for (Item item : itemsOriginal) {
            System.out.println(item);
        }
    }
}

