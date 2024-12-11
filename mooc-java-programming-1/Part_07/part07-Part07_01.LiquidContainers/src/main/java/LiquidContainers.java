
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        while (true) {
            System.out.println("> ");
            
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputSplit = input.split(" ");
            String command = inputSplit[0];
            int amount = Integer.valueOf(inputSplit[1]);
            
            if(command.equals("add")){
                if (amount > 0){
                    container1 += amount;
                }
                
                if (container1 > 100){
                    container1 = 100;
                }
            }
            
            if(command.equals("move")){
                if (container1 - amount < 0){
                    container2 += container1;
                    container1 = 0;
                } else if(container1 - amount >= 0 && amount > 0){
                    container1 -= amount;
                    container2 += amount;
                }
                
                if (container2 > 100){
                    container2 = 100;
                }
            }
            
            if(command.equals("remove")){
                if(amount > 0){
                    container2 -= amount;
                }
                
                if (container2 < 0){
                    container2 = 0;
                }
            }
            
            
        }
    }

}
