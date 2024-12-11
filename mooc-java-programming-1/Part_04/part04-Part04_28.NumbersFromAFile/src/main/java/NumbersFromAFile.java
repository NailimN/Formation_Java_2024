
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        

        try ( Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                int number = Integer.valueOf(scannerFile.nextLine());
                if (lowerBound <= number && upperBound >= number) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
    }
    
}
