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
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            Boolean commandKnown = false;

            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("remove")) {
                commandKnown = true;
                System.out.println("Which one is removed?:");
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }
            
            if (command.equals("add")) {
                commandKnown = true;
                System.out.println("To add:");
                String word = scanner.nextLine();
                list.add(word);
            }
            
            if(command.equals("list")) {
                commandKnown = true;
                list.print();
                
                
            }
            if(!commandKnown){
                System.out.println("Unknown Command");
            }

        }
    }
}
