/**
 * A linked list implementation of a stack
 * 
 * @author Harry Willis
 */
public class LinkedListStack<T extends Object> {
    
    private SinglyLinkedList<T> stack;
    
    /**
     * Construct default empty stack
     */
    public LinkedListStack() {
        this.stack = new SinglyLinkedList<T>();
    }

    /**
     * Construct stack with specified first element
     * @param item for first element
     */
    public LinkedListStack(T item) {
        this.stack = new SinglyLinkedList<T>(item);
    }

    /**
     * isEmpty()
     * Test if stack is empty
     * 
     * @return True if empty, False otherwise
     */
    public boolean isEmpty() {
        return this.stack.size() == 0;
    }

    /**
     * peek()
     * @return item at top of stack, without removing it
     * @throws exception if stack empty 
     */
    public T peek() throws Exception {
        if (this.stack.size() == 0) {
            throw new Exception("Stack is empty");
        }

        return this.stack.get(this.stack.size() - 1);
    }

    /**
     * pop()
     * Remove item at top of stack
     * @return item at top of stack
     * @throws exception if stack empty
     */
    public T pop() throws Exception {
        if (this.stack.size() == 0) {
            throw new Exception("Stack is empty");
        }

        return this.stack.remove(this.stack.size() - 1);
    }

    /**
     * push(T item)
     * Add item to top of stack
     * @return item
     */
    public T push(T item) {
        this.stack.add(item);
        
        return item;
    }
    
    /**
     * search(T item)
     * Search for item in stack
     * @return distance from the top of the stack of the closest to the top occurence
     *      -1 if item does not occur
     * @throws exception if stack is empty
     */
    public int search(T item) throws Exception {
        int dist = this.stack.indexOf(item);

        if (dist == -1) {
            return -1;
        }
        
        return (this.stack.size() - 1) - dist;
    }

    /**
     * toString()
     * Put stack in string format
     * @return stack in string
     */
    public String toString() {
        return "BOTTOM -- " + this.stack.toString() + " -- TOP";
    }
}