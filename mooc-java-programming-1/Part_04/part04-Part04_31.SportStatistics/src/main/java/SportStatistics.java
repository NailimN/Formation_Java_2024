
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int games = 0;
        int win = 0;
        int losses = 0;

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        try ( Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String line = scannerFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int hTPoints = Integer.valueOf(parts[2]);
                int vTPoints = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                    if (hTPoints > vTPoints && homeTeam.equals(team) || vTPoints > hTPoints && visitingTeam.equals(team)) {
                        win++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + losses);
    }

}
