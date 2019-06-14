# Merge Sort

### Definition
Input: An array, *A* with *n* orderable elements *A[0 ... n - 1]*

Output: A sorted ordering of *A*, such that *A[0] &le; A[1] &le; ... &le; A[n - 1]*

### Description
* Merge sort is a divide and conquer algorithm which are algorithms that typically follow these steps:
    1. Divide: Break up the problem into smaller subproblems
    
    2. Conquer: Recursively solve the subproblems

    3. Combine: Appropiately combine the solutions
* Merge sort divides the input array in two halves, calls itself on the two halves, and then merges the two sorted halves

### Pseudocode

    function mergeSort(int[] array)

        if (array.length &le; 2)
            
            return
        
        end if

        int mid <- array.length &divide; 2

        int[] low <- int[mid]

        int[] high <- int[array.length - mid]

        low <- array[0 ... mid - 1]

        high <- array[mid ... n - 1]

        mergeSort(low)

        mergeSort(high)

        merge(array, low, high, mid, array.length - mid)
    
    end func

    function merge(int[] array, int[] low, int[] high, int begin, int end)

        int i, j, k <- 0

        while (i &le; begin and j &le; end) 

            if (low[i] &le; high[j])
                
                array[k++] <- low[i++]
            
            else 

                array[k++] <- high[j++]
            
            end if else
        
        end while

        while (i &lt; begin)
            
            array[k++] <- low[i++]
        
        end while

        while (j &lt; end)

            array[k++] <- high[j++]
        end while

    end func

### Runtime
Worst case: *O(nlog(n))* (In fact, this is the time complexity of all cases, best, worst and average)

Proof:

* The divide step computes the midpoint of each sub-array takes constant time, *O(1)*

* The conquer step sorts two sub-arrays of length *n / 2* each 
    * An array of length *n* can only be halved *log(n)* times, thus, mergesort, at worst, conquers *log(n)* sub-arrays 

* The merge step iterates over *n* elements of the sub-arrays, which takes *O(n)* time

* Thus, for each of the *log(n)* sub-arrays we iterate the *n* elements to merge, resulting in *O(nlog(n))* time 