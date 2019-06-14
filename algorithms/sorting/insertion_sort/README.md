# Insertion Sort

### Definition
Input: An array, *A* with *n* orderable elements *A[0 ... n - 1]*

Output: A sorted ordering of *A*, such that *A[0] &le; A[1] &le; ... &le; A[n - 1]*

### Description
* Insertion sort works by placing one element of the collection in the correct position at a time
* In a way, it partitions the collection into sorted and unsorted segments
* At first, the sorted segment contains 1 element, thus, the algorithm begins by picking the second element to put in the correct position, then the third, and so on

### Pseudocode

    function insertionSort(int[] array)

        for (i <- 1 to array.length)

            int curr <- array[i]

            int j <- i - 1

            while (j &ge; 0 and array[j] &gt; curr)

                array[j + 1] <- array[j]

                j <- j - 1

            end while

            array[j + 1] <- curr

        end for

    end func

### Runtime
Worst case: *O(n<sup>2</sup>)*

Proof:

* The worst case occurs when the collection is in decreasing order. This is because for every element in the list, we enter the while loop and have to swap 

* When *i = 1* -> zero comparisons 

    * *i = 2* -> one comparison 

    * *i = 3* -> two comparisons, and so on 

* Thus, when *i = m*, *m - 1* comparisons are made

* Then for an array of length *n*, bubble sort does *1 + 2 + 3 + ... + (n - 1)* comparisons

* This is equal to *n(n - 1)* &divide; *2* 

* Which is equal to *O(n<sup>2</sup>)*