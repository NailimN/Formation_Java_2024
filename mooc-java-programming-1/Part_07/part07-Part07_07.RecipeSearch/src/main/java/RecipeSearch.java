
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        String file = "";
        String command = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        file = scanner.nextLine();
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {

            System.out.println(" ");
            System.out.println("Enter commands: ");
            command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                list(file);
            }

            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                findName(file, searchedWord);
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                findCookingTime(file, maxTime);
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchedWord = scanner.nextLine();
                findIngredient(file, searchedWord);
            }

        }

    }

    public static void list(String file) {
        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println(name + ", cooking time: " + cookingTime);

                while (true) {
                    String next = scanner.nextLine();
                    if (next.equals("") || !scanner.hasNextLine()) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void findName(String file, String searchedWord) {

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());

                while (true) {
                    String next = scanner.nextLine();
                    if (next.equals("") || !scanner.hasNextLine()) {
                        break;
                    }

                }

                if (name.contains(searchedWord)) {
                    System.out.println(name + ", cooking time: " + cookingTime);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void findCookingTime(String file, int maxTime) {
        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());

                while (true) {
                    String next = scanner.nextLine();
                    if (next.equals("") || !scanner.hasNextLine()) {
                        break;
                    }
                }
                if (cookingTime <= maxTime) {
                    System.out.println(name + ", cooking time: " + cookingTime);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void findIngredient(String file, String searchedWord) {

        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                boolean found = false;
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());

                while (true) {
                    String next = scanner.nextLine();
                    if (next.equals("") || !scanner.hasNextLine()) {
                        break;
                    }
                    String[] words = next.split(" ");
                    for (String word : words) {
                        if (word.equals(searchedWord)) {
                            found = true;
                        }
                    }

                }

                if (found) {
                    System.out.println(name + ", cooking time: " + cookingTime);
                }
                found = false;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
