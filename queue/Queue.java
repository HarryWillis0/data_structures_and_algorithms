/**
 * Queue interface
 * 
 * @author Harry Willis
 */
interface Queue<T>{
    /**
     * enqueue(T item)
     * add an element to the back of the queue, extending capacity if necessary
     * @param item to be added
     * @return item added
     */
    public T enqueue(T item);

    /**
     * dequeue()
     * removes element at the front of the queue
     * @return item removed
     * @throws exception if queue empty
     */
    public T dequeue() throws Exception;

    /**
     * poll()
     * gets element at the front of the queue without removing it
     * @return item at the front of queue
     * @throws exception if queue empty
     */
    public T poll() throws Exception;

    /**
     * isEmpty()
     * Test if queue is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * toString()
     * Put queue in a string
     * @return queue in a string
     */
    public String toString();
}