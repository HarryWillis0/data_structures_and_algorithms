import java.util.Arrays;
/**
 * Tester program for InsertionSort.java
 * 
 * @author Harry Willis
 */
public class InsertionSortTester {
    public static void main(String[] args) {
        // 1 element array
        int[] intArray1 = {-9};
        System.out.println("Insertion sorting: " + Arrays.toString(intArray1));
        InsertionSort.insertionSort(intArray1);
        System.out.println("Sorted:" + Arrays.toString(intArray1) + "\n");

        // random array
        int[] intArray2 = {-9, 3, 55, -9999, 2, 100};
        System.out.println("Insertion sorting: " + Arrays.toString(intArray2));
        InsertionSort.insertionSort(intArray2);
        System.out.println("Sorted: " + Arrays.toString(intArray2) + "\n");


        //already sorted
        int[] intArray3 = {1, 3, 55, 9999, 1001010};
        System.out.println("Insertion sorting: " + Arrays.toString(intArray3));
        InsertionSort.insertionSort(intArray3);
        System.out.println("Sorted: " + Arrays.toString(intArray3) + "\n");

        // descending order test
        int[] intArray4 = {4000, 244, 32, -9, -10};
        System.out.println("Insertion sorting: " + Arrays.toString(intArray4));
        InsertionSort.insertionSort(intArray4);
        System.out.println("Sorted: " + Arrays.toString(intArray4) + "\n");

        // array with equal elements
        int[] intArray5 = {-9, 3, 55, -9, 2};
        System.out.println("Insertion sorting: " + Arrays.toString(intArray5));
        InsertionSort.insertionSort(intArray5);
        System.out.println("Sorted: " + Arrays.toString(intArray5));
    }
}