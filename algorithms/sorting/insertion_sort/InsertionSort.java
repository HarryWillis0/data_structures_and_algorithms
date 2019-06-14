/**
 * An insertion sort implementation for int arrays in Java
 * 
 * @author Harry Willis
 */
public class InsertionSort {
    /**
     * insertionSort(int[] array)
     * insertion sort iterates through the array picking an element
     *  and shifting it to its correct spot
     * @param int array to be sorted
     */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            
            int j = i - 1;

            while (j >= 0 && array[j] > curr) {
                // shift item
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = curr;
        }
    }
}