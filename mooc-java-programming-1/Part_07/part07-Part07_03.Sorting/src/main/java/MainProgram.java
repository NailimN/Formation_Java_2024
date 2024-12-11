import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            
            swap(array, i , indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallestIndex = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
        
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        for (int i = startIndex; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int memory = array[index2];
        array[index2] = array[index1];
        array[index1] = memory;
    }
}
