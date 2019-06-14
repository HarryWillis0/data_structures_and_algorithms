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
        int[] exp1 = {-9};
        MergeSort.mergeSort(intArray1);
        assert Arrays.equals(intArray1, exp1) : "Sorting failed";
        
        // random array
        int[] intArray2 = {-9, 3, 55, -9999, 2, 100};
        int[] expected2 = {-9999, -9, 2, 3, 55, 100};
        MergeSort.mergeSort(intArray2);
        assert Arrays.equals(intArray2, expected2) : "Sorting failed";

        //already sorted
        int[] intArray3 = {1, 3, 55, 9999, 1001010};
        int[] expected3 = {1, 3, 55, 9999, 1001010};
        MergeSort.mergeSort(intArray3);
        assert Arrays.equals(intArray3, expected3) : "Sorting failed";

        // descending order test
        int[] intArray4 = {4000, 244, 32, -9, -10};
        int[] expected4 = {-10, -9, 32, 244, 4000};
        MergeSort.mergeSort(intArray4);
        assert Arrays.equals(intArray4, expected4) : "Sorting failed";

        // array with equal elements
        int[] intArray5 = {-9, 3, 55, -9, 2};
        int[] expected5 = {-9, -9, 2, 3, 55};
        MergeSort.mergeSort(intArray5);
        assert Arrays.equals(intArray5, expected5) : "Sorting failed";
    }
}