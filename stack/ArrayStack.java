import java.util.Arrays;

/**
 * An array implementation of a stack
 * 
 * @author Harry Willis
 */

public class ArrayStack<T extends Comparable <T>> implements Stack<T> {
    
    private T[] stack;

    private int top;

    private int size;

    
    /** 
     * Build default ArrayStack with size 5
    */
    public ArrayStack(){
        this(5);
    }
    
    /** 
     * Build ArrayStack with specified size
     * @param size of stack
    */
    @SuppressWarnings("unchecked")
    public ArrayStack(int size){
        this.size = size;
        
        this.top = -1;
    
        this.stack = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        if(this.top == -1){
            return true;
        } 
         
        return false;
    }

    public T peek() throws Exception {
    
        return null;
    }

    public T pop() throws Exception {
        return null;
    }

    public T push(T item){
        return null;
    } 
    public int search(T item) throws Exception {
        return -1;
    }
   
    public String toString(){
        if(isEmpty()){
            return "bottom [] top";
        }
        String s = "bottom: [" + stack[0];
        for(int i = 0; i < this.size - 1;i++){
            s += " " + this.stack[i];
        }
        
        return s + "] top";
    }

    /**
     * Helper method to see if we need to extend size of stack
     */
    private boolean isFull(){
        return false;
    }
    private T[] extendCapacity(){
        return this.stack;
    }

    /**
     * internal testing
     */
    public static void main(String[] args){
        
    }
}