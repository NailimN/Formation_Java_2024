
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }
        
        /*books.add(new Book(76242, "name for the book 76242"));
        books.add(new Book(141282, "name for the book 15368"));
        books.add(new Book(232161, "name for the book 26055"));
        books.add(new Book(788299, "name for the book 52346"));
        books.add(new Book(804584, "name for the book 52346"));*/
        
        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        //begin = 0 // the 0th index of the list (i.e, the first index of the list)
        int begin = 0;
        //end = size(list) - 1 // the last index in the list
        int end = books.size() - 1;
        //repeat until begin is larger than end:
        
        while(begin <= end){
            //middle = (end + begin) / 2+
            int middle = (end + begin)/2;
            
            //if the value at list[middle] is searched
            if (books.get(middle).getId() == searchedId){
            //return the value of the variable middle
            return middle;
            }
            
            //if the value at list[middle] is smaller than searched
            if (books.get(middle).getId() < searchedId){
            //begin = middle + 1
            begin = middle + 1;
            }
            //if the value at list[middle] is larger than searched
            if (books.get(middle).getId() > searchedId){
            //end = middle - 1
            end = middle - 1;
            }
        }

        return -1;
    }
}
