# Bubble Sort

### Definition
Input: An array, *A*, with *n* orderable elements *A[0 ... n - 1]*

Output: A sorted ordering of *A*, such that *A[0] &le; A[1] &le; ... &le; A[n - 1]* 

### Description
* bubble sort works by repeatedly iterating through a collection of elements
* it compares adjacent elements and swaps them if they are in the wrong order
* termination happens when a pass over the collection occurs with no swaps

### Pseudocode

    function bubbleSort(int[] array)
        
        while (swap occurs) 
        
            for (each adjacent elements) 
         
                if (elements out of order) 
         
                    swap elements
         
                end if
        
            end for
    
        end while

    end func


### Runtime
Worst case: *O(n<sup>2</sup>)*

Proof: 
    
    * When *i = 1* -> zero comparisons 

          *i = 2* -> one comparison 

          *i = 3* -> two comparisons, and so on 

    * Thus, when *i = m*, *m - 1* comparisons are made

    * Then for an array of length *n*, bubble sort does *1 + 2 + 3 + ... + (n - 1)* comparisons

    * This is equal to *n(n - 1)* &divide; *2* 

    * Which is equal to *O(n<sup>2</sup>)*
    

 
