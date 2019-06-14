import java.util.Arrays;
/**
 * A merge sort implementation for int arrays in Java
 * 
 * @author Harry Willis
 */
public class MergeSort {
    /**
     * mergeSort(int[] array)
     * halves array and recursively sorts the sub-arrays
     * then calls merge to combine sorted sub-arrays
     * @param array
     */
    public static void mergeSort(int[] array) {
        // base case
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] low = Arrays.copyOfRange(array, 0, mid);

        int[] high = Arrays.copyOfRange(array, mid, array.length);

        // recursive calls
        mergeSort(low);
        mergeSort(high);

        // combine sorted sub-arrays
        merge(array, low, high, mid, array.length - mid);
    }

    private static void merge(int[] array, int[] low, int[] high, int begin, int end) {
        // indices into low, high and array, respectively
        int i = 0, j = 0, k = 0;

        while (i < begin && j < end) {
            if (low[i] <= high[j]) {
                array[k++] = low[i++];

            } else {
                array[k++] = high[j++];
            }
        }

        while (j < end) {
            array[k++] = high[j++];
        }
        
        while (i < begin) {
            array[k++] = low[i++];
        }
    }
}