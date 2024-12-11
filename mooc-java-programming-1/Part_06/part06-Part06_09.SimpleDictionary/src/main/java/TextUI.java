/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author milia
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            Boolean commandKnown = false;

            if (command.equals("end")) {
                commandKnown = true;
                System.out.println("Bye Bye!");
                break;
            }
            
            if (command.equals("add")) {
                commandKnown = true;
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            }
            
            if(command.equals("search")) {
                commandKnown = true;
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if(dictionary.translate(word) != null){
                   System.out.println("Translation:");
                System.out.println(dictionary.translate(word)); 
                } else {
                    System.out.println("Word " + word + " was not found");
                }
                
            }
            if(!commandKnown){
                System.out.println("Unknown Command");
            }

        }
    }
}