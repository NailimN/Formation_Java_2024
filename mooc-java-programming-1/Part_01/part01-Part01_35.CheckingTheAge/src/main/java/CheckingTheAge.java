
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");

        int number = Integer.valueOf(scan.nextLine());
        if (number >= 0 && number <= 120 ) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
        
        int gift = Integer.valueOf(scan.nextLine());
        
        if (gift < 5000){
            System.out.println("No tax!");
        } else if (gift < 25000){
            System.out.println("Tax: " + (100 + (gift - 5000)*0.08));
        }else if (gift < 55000){
            System.out.println("Tax: " + (1700 + (gift - 25000)*0.1));
        }else if (gift < 200000){
            System.out.println("Tax: " + (4700 + (gift - 55000)*0.12));
        }else if (gift < 1000000){
            System.out.println("Tax: " + (22100+ (gift - 200000)*0.15));
        }else {
            System.out.println("Tax: " + (142100 + (gift - 1000000)*0.17)); 
        }
        
        System.out.println("Give a year: ");
        
        int year1 = Integer.valueOf(scan.nextLine());
        
        if (year1 % 4 == 0 && year1 % 100 != 0){
            System.out.println("The year is a leap year.");
        }else if (year1 % 100 == 0 && year1 % 400 == 0){
            System.out.println("The year is a leap year.");
        }else {
            System.out.println("The year is not a leap year."); 
        }
    }
}
