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

    public void start() {
        Container container1 = new Container("First");
        Container container2 = new Container("Second");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println(container1);
            System.out.println(container2);
            String input = scanner.nextLine();
            
            
            if (input.equals("quit")) {
                break;
            }

            String[] inputSplit = input.split(" ");
            String command = inputSplit[0];
            int amount = Integer.valueOf(inputSplit[1]);
            
            if (command.equals("add")) {
                container1.add(amount);
            }

            if (command.equals("remove")) {
                container2.remove(amount);
            }

            if (command.equals("move")) {
                if(amount > 0 && container1.contains() - amount < 0){
                    container2.add(container1.contains());
                } else if(container1.contains() - amount >= 0 && amount > 0){
                    container2.add(amount);
                }
                
                container1.remove(amount);
            }

        }
    }
}
