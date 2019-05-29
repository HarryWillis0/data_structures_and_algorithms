/**
 * Stack interface
 *
 * @author Harry Willis 
 */

interface Stack<T>{
    
    /**
     * isEmpty()
     * Test if stack is empty
     * 
     * @return True if empty, False otherwise
     */
    public boolean isEmpty();

    /**
     * peek()
     * @return item at top of stack, without changing the stack
     * @throws exception if stack empty 
     */
    public T peek() throws Exception;

    /**
     * pop()
     * Remove item at top of stack
     * @return item at top of stack
     * @throws exception if stack empty
     */
    public T pop() throws Exception;

    /**
     * push(T item)
     * Add item to top of stack
     * @return the item
     */
    public T push(T item);
    
    /**
     * search(T item)
     * Search for item in stack
     * @return index of item in stack
     * @throws exception if stack is empty
     */
    public int search(T item) throws Exception;

    /**
     * toString()
     * Put stack in string format
     * @return stack in string
     */
    public String toString();

}


