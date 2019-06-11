import java.util.Arrays;

/**
 * Tester program for BubbleSort.java
 * 
 * @author Harry Willis
 */
public class BubbleSortTester {
    public static void main(String[] args) {
        // 1 element array
        int[] intArray1 = {-9};
        System.out.println("Bubble sorting: " + Arrays.toString(intArray1));
        BubbleSort.bubbleSort(intArray1);
        System.out.println("Sorted:" + Arrays.toString(intArray1) + "\n");

        // random array
        int[] intArray2 = {-9, 3, 55, -9999, 2, 100};
        System.out.println("Bubble sorting: " + Arrays.toString(intArray2));
        BubbleSort.bubbleSort(intArray2);
        System.out.println("Sorted: " + Arrays.toString(intArray2) + "\n");
        
        //already sorted
        int[] intArray3 = {1, 3, 55, 9999, 1001010};
        System.out.println("Bubble sorting: " + Arrays.toString(intArray3));
        BubbleSort.bubbleSort(intArray3);
        System.out.println("Sorted: " + Arrays.toString(intArray3) + "\n");

        // descending order test
        int[] intArray4 = {4000, 244, 32, -9, -10};
        System.out.println("Bubble sorting: " + Arrays.toString(intArray4));
        BubbleSort.bubbleSort(intArray4);
        System.out.println("Sorted: " + Arrays.toString(intArray4) + "\n");

        // array with equal elements
        int[] intArray5 = {-9, 3, 55, -9, 2};
        System.out.println("Bubble sorting: " + Arrays.toString(intArray5));
        BubbleSort.bubbleSort(intArray5);
        System.out.println("Sorted: " + Arrays.toString(intArray5));  
    }
}