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
    private BirdDataBase birds;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new BirdDataBase();
        
    }

    public void start() {
        
        while (true) {
            System.out.println("?");
            String word = scanner.nextLine();

            if (word.equals("Quit")) {
                break;
            }
            
            if (word.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin");
                String latinName = scanner.nextLine();
                birds.addBird(name, latinName);
            }
            
            if (word.equals("Observation")) {
                System.out.println("Bird?:");
                String name = scanner.nextLine();
                birds.addObservation(name);
            }
            
            if (word.equals("All")) {
                birds.printAll();
            }
            
            if (word.equals("One")) {
                System.out.println("Bird?:");
                String name = scanner.nextLine();
                birds.printOne(name);
            }
        }
    }
}

