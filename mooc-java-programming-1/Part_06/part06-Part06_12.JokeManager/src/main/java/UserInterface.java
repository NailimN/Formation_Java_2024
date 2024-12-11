
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author milia
 */
public class UserInterface {

    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            Boolean commandKnown = false;

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                commandKnown = true;
                System.out.println("Write the joke to be added: ");
                String word = scanner.nextLine();
                jokes.addJoke(word);
            }

            if (command.equals("2")) {
                commandKnown = true;
                System.out.println(jokes.drawJoke());
            }

            if (command.equals("3")) {
                commandKnown = true;
                jokes.printJokes();

            }
            if (!commandKnown) {
                System.out.println("Unknown Command");
            }

        }
    }
}
