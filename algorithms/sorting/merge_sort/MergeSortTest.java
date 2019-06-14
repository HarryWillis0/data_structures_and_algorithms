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
<<<<<<< HEAD
        int[] exp1 = {-9};
        MergeSort.mergeSort(intArray1);
        assert Arrays.equals(intArray1, exp1) : "Sorting failed";
=======
        System.out.println("Merge sorting: " + Arrays.toString(intArray1));
        MergeSort.mergeSort(intArray1);
        System.out.println("Sorted:" + Arrays.toString(intArray1) + "\n");
>>>>>>> 57f561b92c3a31d47d54394a79f25c8bdbd48306
        
        // random array
        int[] intArray2 = {-9, 3, 55, -9999, 2, 100};
        int[] expected2 = {-9999, -9, 2, 3, 55, 100};
<<<<<<< HEAD
        MergeSort.mergeSort(intArray2);
        assert Arrays.equals(intArray2, expected2) : "Sorting failed";
=======
        System.out.println("Merge sorting: " + Arrays.toString(intArray2));
        MergeSort.mergeSort(intArray2);
        System.out.println("Sorted: " + Arrays.toString(intArray2) + "\n");
>>>>>>> 57f561b92c3a31d47d54394a79f25c8bdbd48306

        //already sorted
        int[] intArray3 = {1, 3, 55, 9999, 1001010};
        int[] expected3 = {1, 3, 55, 9999, 1001010};
<<<<<<< HEAD
        MergeSort.mergeSort(intArray3);
        assert Arrays.equals(intArray3, expected3) : "Sorting failed";
=======
        System.out.println("Merge sorting: " + Arrays.toString(intArray3));
        MergeSort.mergeSort(intArray3);
        System.out.println("Sorted: " + Arrays.toString(intArray3) + "\n");
>>>>>>> 57f561b92c3a31d47d54394a79f25c8bdbd48306

        // descending order test
        int[] intArray4 = {4000, 244, 32, -9, -10};
        int[] expected4 = {-10, -9, 32, 244, 4000};
<<<<<<< HEAD
        MergeSort.mergeSort(intArray4);
        assert Arrays.equals(intArray4, expected4) : "Sorting failed";
=======
        System.out.println("Merge sorting: " + Arrays.toString(intArray4));
        MergeSort.mergeSort(intArray4);
        System.out.println("Sorted: " + Arrays.toString(intArray4) + "\n");
>>>>>>> 57f561b92c3a31d47d54394a79f25c8bdbd48306

        // array with equal elements
        int[] intArray5 = {-9, 3, 55, -9, 2};
        int[] expected5 = {-9, -9, 2, 3, 55};
<<<<<<< HEAD
        MergeSort.mergeSort(intArray5);
        assert Arrays.equals(intArray5, expected5) : "Sorting failed";
=======
        System.out.println("Merge sorting: " + Arrays.toString(intArray5));
        MergeSort.mergeSort(intArray5);
        System.out.println("Sorted: " + Arrays.toString(intArray5));
>>>>>>> 57f561b92c3a31d47d54394a79f25c8bdbd48306
    }
}