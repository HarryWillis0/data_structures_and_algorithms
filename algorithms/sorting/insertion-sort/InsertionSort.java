/**
 * An insertion sort implementation for int arrays in Java
 * 
 * @author Harry Willis
 */
public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            
            int j = i - 1;

            while (j >= 0 && a[j] > curr) {
                // shift item
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = curr;
        }
    }
}