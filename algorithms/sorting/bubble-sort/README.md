# Bubble Sort

### Definition
Input: An array, A, with n orderable elements A[0..n-1]
Output: A sorted ordering of A

### Description
* bubble sort works by repeatedly iterating through a collection of elements
* it compares adjacent elements and swaps them if they are in the wrong order
* termination happens when a pass over the collection occurs with no swaps

### Psuedocode
function bubbleSort(int[] array) {
    while (array is not sorted) {
        for (each adjacent elements) {
            if (elements out of order) {
                swap elements
            }
        }
    }
} 


### Runtime
*O*(n^2)
 
Proof: 