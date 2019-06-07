/**
 * A bubble sort implementation for int arrays in java
 * 
 * @author Harry Willis
 */
 public class BubbleSort {

     /**
      * bubbleSort(int[] array)
      * Sorts an array of ints by repeatedly comparing adjacent pairs
      * If they are out of order they are swapped
      * bubble sort continues until no swaps are made
      * @param array
      */
    public static void bubbleSort(int[] array) {
        // sorted flag
        boolean swap = true;

        while (swap) {
            swap = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = true;

                    //swap
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}