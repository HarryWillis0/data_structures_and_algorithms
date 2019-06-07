# Bubble Sort

### Definition
Input: An array, *A*, with *n* orderable elements *A[0 ... n - 1]*

Output: *A* sorted ordering of *A*, such that *A[0] &le; A[1] ... &le; A[n - 1]* 

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
Worst case: *O(n<sup>2</sup>)*

Proof: 
    
When *i = 1*, zero comparisons, *i = 2*, one comparison, *i = 3*, two comparisons, and so on 

Thus, when *i* *=* *m*, *m* *-* *1* comparisons are made

Then for an array of length *n*, bubble sort does *1 + 2 + 3 + ... + (n - 1)* comparisons

    

 
