import java.util.Arrays;
/**
 * A test program for MergeSort.java
 * 
 * @author Harry Willis
 */
public class MergeSortTest {
    public static void main(String[] args) {
        // 1 element array
        int[] intArray1 = {-9};
        System.out.println("Merge sorting: " + Arrays.toString(intArray1));
        MergeSort.mergeSort(intArray1);
        System.out.println("Sorted:" + Arrays.toString(intArray1) + "\n");
        
        // random array
        int[] intArray2 = {-9, 3, 55, -9999, 2, 100};
        int[] expected2 = {-9999, -9, 2, 3, 55, 100};
        System.out.println("Merge sorting: " + Arrays.toString(intArray2));
        MergeSort.mergeSort(intArray2);
        System.out.println("Sorted: " + Arrays.toString(intArray2) + "\n");

        //already sorted
        int[] intArray3 = {1, 3, 55, 9999, 1001010};
        int[] expected3 = {1, 3, 55, 9999, 1001010};
        System.out.println("Merge sorting: " + Arrays.toString(intArray3));
        MergeSort.mergeSort(intArray3);
        System.out.println("Sorted: " + Arrays.toString(intArray3) + "\n");

        // descending order test
        int[] intArray4 = {4000, 244, 32, -9, -10};
        int[] expected4 = {-10, -9, 32, 244, 4000};
        System.out.println("Merge sorting: " + Arrays.toString(intArray4));
        MergeSort.mergeSort(intArray4);
        System.out.println("Sorted: " + Arrays.toString(intArray4) + "\n");

        // array with equal elements
        int[] intArray5 = {-9, 3, 55, -9, 2};
        int[] expected5 = {-9, -9, 2, 3, 55};
        System.out.println("Merge sorting: " + Arrays.toString(intArray5));
        MergeSort.mergeSort(intArray5);
        System.out.println("Sorted: " + Arrays.toString(intArray5));
    }
}