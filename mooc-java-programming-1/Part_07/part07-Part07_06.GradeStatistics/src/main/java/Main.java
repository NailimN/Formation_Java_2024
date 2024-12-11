
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList();
        Grades grade = new Grades();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                points.add(point);
            }
        }
        System.out.println("Point average (all): " + average(points));

        if (passingAverage(points) == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage(points));
        }

        System.out.println("Pass percentage: " + passPercentage(points));
        
        grade.printGrades(points);
    }

    public static double average(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;

        for (int point : points) {
            sum += point;
            count++;
        }

        return 1.0 * sum / count;
    }

    public static double passingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;

        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }

    public static double passPercentage(ArrayList<Integer> points) {
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                count++;
            }
        }
        return 100.0 * count / points.size();
    }
}
