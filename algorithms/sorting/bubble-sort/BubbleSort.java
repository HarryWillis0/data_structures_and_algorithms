/**
 * A bubble sort implementation for int arrays in java
 * 
 * @author Harry Willis
 */
 public class BubbleSort {
    public static void bubbleSort(int[] a) {
        // sorted flag
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    flag = true;

                    //swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}