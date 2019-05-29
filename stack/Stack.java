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

    // todo
    /**
     * peek()
     * 
     */
    public T peek() throws Exception;

    /**
     * pop()
     * 
     */
    public T pop() throws Exception;

    /**
     * push(T item)
     * 
     */
    public T push(T item);
    /**
     * search(T item)
     *  
     */
    public int search(T item);

}


