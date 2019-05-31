import java.util.Arrays;

/**
 * An array implementation of a queue
 * 
 * @author Harry Willis
 */
public class ArrayQueue<T> implements Queue<T> {
    
    private T[] queue;

    private int front;
    
    // the next available spot in the queue
    private int back;

    private int size;

    /**
     * Build default ArrayQueue with size 5
     */
    public ArrayQueue() {
        this(5);
    }

    /**
     * Build ArrayQueue with specified size
     */
    @SuppressWarnings("unchecked")
    public ArrayQueue(int size) {
        this.front = 0;
        
        this.back = 0;

        this.size = size;

        this.queue = (T[]) new Object[size];
    }
    /**
     * enqueue(T item)
     * add an element to the back of the queue, extending capacity if necessary
     * @param item to be added
     * @return item added
     */
    public T enqueue(T item) {
        if(this.back + 1 == this.size){
            this.extendCapacity();
        }

        this.queue[this.back++] = item;
        
        return item;
    }

    /**
     * dequeue()
     * removes element at the front of the queue
     * @return item removed
     * @throws exception if queue empty
     */
    public T dequeue() throws Exception {
        if(this.back == 0) {
            throw new Exception("Queue is empty");
        }
        T temp = this.queue[front];

        for(int i = this.front; i < back; i++) {
            this.queue[i] = this.queue[i + 1];
        }
        
        this.back--;

        return temp;
    }

    /**
     * poll()
     * gets element at the front of the queue without removing it
     * @return item at the front of queue
     * @throws exception if queue empty
     */
    public T poll() throws Exception {
        if(this.back == 0) {
            throw new Exception("Queue is empty");
        }
        return this.queue[this.front];
    }

    /**
     * isEmpty()
     * Test if queue is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return back == 0;
    }

    /**
     * toString()
     * Put queue in a string
     * @return queue in a string
     */
    public String toString() {
        if (this.isEmpty()) {
            return "FRONT -- [] -- BACK";
        }
        String s = "FRONT -- [" + this.queue[0];
        for(int i = 1; i < this.back; i++) {
            s += ", " + this.queue[i];
        }

        return s + "] -- BACK";
    }

    /**
     * isFull()
     * A helper method to determine if capacity of the queue must be extended
     * @return true if full, false otherwise
     */
    private boolean isFull() {
        return this.back + 1 == this.size;
    }

    /**
     * extendCapacity()
     * Doubles capacity of the queue to allow for more elements
     * @return the new queue
     */
    @SuppressWarnings("unchecked")
    private T[] extendCapacity() {
        T[] temp = (T[]) new Object[this.size * 2];
        
        for(int i = 0; i < this.back; i++) {
            temp[i] = this.queue[i];
        }
        
        this.size *= 2;
        
        this.queue = temp;
        
        return this.queue;
    }
}