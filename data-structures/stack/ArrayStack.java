/**
 * An array implementation of a stack
 * 
 * @author Harry Willis
 */
public class ArrayStack<T extends Object> implements Stack<T> {
    
    private T[] stack;

    private int top;

    private int size;

    /** 
     * Build default ArrayStack with size 5
    */
    public ArrayStack() {
        this(5);
    }
    
    /** 
     * Build ArrayStack with specified size
     * @param size of stack
    */
    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        this.size = size;
        
        this.top = -1;
    
        this.stack = (T[]) new Object[size];
    }

    /** 
     * Test if stack empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        if(this.top == -1) {
            return true;
        } 

        return false;
    }

    /**
     * Return item at top of stack without removing it
     * @return item at the top of stack
     * @throws exception if stack is empty
     */
    public T peek() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return this.stack[this.top];
    }

    /**
     * Remove item at top of stack
     * @return the item at the top of the stack
     * @throws exception if stack is empty
     */
    public T pop() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return this.stack[this.top--];
    }

    /** 
     * Add an item to the top of the stack, extend capacity if stack is full
     * @return item
     */
    public T push(T item) {
        if(this.isFull()) {
            this.extendCapacity();
        }
        
        this.stack[++this.top] = item;
        
        return item;
    } 

    /**
     * Search for item in the stack
     * @return distance from the top of the stack of the closest to the top occurence
     *          -1 if item does not occur on stack
     * @throws exception if stack is empty 
     */
    public int search(T item) throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack is empty");
        }

        int dist = 0;
        int i = this.top;
        while(i >= 0 && !this.stack[i].equals(item)) {
            dist++;
            i--;
        }

        if (i > -1) {
            return dist;
        }

        return i;
    }
   
    /** 
     * Return stack in String form
     * @return stack in a String
     */
    public String toString() {
        if(this.isEmpty()) {
            return "BOTTOM -- [] -- TOP";
        }
        
        String s = "BOTTOM -- [" + stack[0];
        for(int i = 1; i < this.top + 1; i++) {
            s += ", " + this.stack[i];
        }
        
        return s + "] -- TOP";
    }

    /**
     * Helper method to see if we need to extend size of stack
     */
    private boolean isFull() {
        if(this.top == this.size - 1) {
            return true;
        }
        
        return false;
    }

    /**
     * Double size of stack
     * @return the stack
     */
    @SuppressWarnings("unchecked")
    private T[] extendCapacity() {
        T[] temp = (T[]) new Object[this.size * 2];
        
        for(int i = 0; i < this.top + 1; i++) {
            temp[i] = this.stack[i];
        }
        
        this.size *= 2;
        
        this.stack = temp;
        
        return this.stack;
    }
}