
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
            //System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int bigestRow = (1 + 2 * height - 1);
        int nSpace = (bigestRow - 1) / 2;
        for (int i = 0; i < height; i++) {
            printSpaces(nSpace - i);
            printStars(i * 2 + 1);
            //System.out.println("");
        }
        printSpaces(nSpace - 1);
        System.out.print("***");
        System.out.println("");
        printSpaces(nSpace - 1);
        System.out.print("***");
        System.out.println("");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
