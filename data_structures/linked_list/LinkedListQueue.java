/**
 * A linked list implementation of a queue
 * 
 * @author Harry Willis
 */
public class LinkedListQueue<T> {
    
    private SinglyLinkedList<T> queue;

    /**
     * Construct default empty queue
     */
    public LinkedListQueue() {
        this.queue = new SinglyLinkedList<T>();
    }

    /**
     * 
     * @param item that is first element of queue
     */
    public LinkedListQueue(T item) {
        this.queue = new SinglyLinkedList<T>(item);
    }
    
    /**
     * enqueue(T item)
     * add an element to the back of the queue
     * @param item to be added
     * @return item added
     */
    public T enqueue(T item) {
        this.queue.add(item);
    
        return item;
    }

    /**
     * dequeue()
     * removes element at the front of the queue
     * @return item removed
     * @throws exception if queue empty
     */
    public T dequeue() throws Exception {
        if (this.queue.size() == 0) {
            throw new Exception("Queue is empty");
        }

        return this.queue.remove(0);
    }

    /**
     * poll()
     * gets element at the front of the queue without removing it
     * @return item at the front of queue
     * @throws exception if queue empty
     */
    public T poll() throws Exception {
        if (this.queue.size() == 0) {
            throw new Exception("Queue is empty");
        }
        
        return this.queue.get(0);
    }

    /**
     * isEmpty()
     * Test if queue is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    /**
     * toString()
     * Put queue in a string
     * @return queue in a string
     */
    public String toString() {
        return "FRONT -- " + this.queue.toString() + " -- BACK";
    }
}