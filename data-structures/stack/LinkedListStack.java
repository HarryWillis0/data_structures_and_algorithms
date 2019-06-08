/**
 * A linked list implementation of a stack
 * 
 * @author Harry Willis
 */
public class LinkedListStack<T extends Object> implements Stack<T> {
    /**
     * isEmpty()
     * Test if stack is empty
     * 
     * @return True if empty, False otherwise
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * peek()
     * @return item at top of stack, without removing it
     * @throws exception if stack empty 
     */
    public T peek() throws Exception {
        return null;
    }

    /**
     * pop()
     * Remove item at top of stack
     * @return item at top of stack
     * @throws exception if stack empty
     */
    public T pop() throws Exception {
        return null;
    }

    /**
     * push(T item)
     * Add item to top of stack
     * @return item
     */
    public T push(T item) {
        return null;
    }
    
    /**
     * search(T item)
     * Search for item in stack
     * @return distance from the top of the stack of the closest to the top occurence
     *      -1 if item does not occur
     * @throws exception if stack is empty
     */
    public int search(T item) throws Exception {
        return -1;
    }

    /**
     * toString()
     * Put stack in string format
     * @return stack in string
     */
    public String toString() {
        return null;
    }
}