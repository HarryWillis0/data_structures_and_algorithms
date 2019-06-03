/**
 * A node object class for a node with two links
 * 
 * @author Harry Willis
 */
public class Node<T extends Object> {
    private T data;
    
    private Node<T> prev;

    private Node<T> next;

    /**
     * Construct empty node
     */
    public Node() {
        this(null);
    }

    /**
     * Construct node with specified data with null links
     * @param data for node
     */
    public Node(T data) {
        this(data, null);
    }

    /**
     * Construct node with specified data and node to connect by prev
     * @param data for node
     * @param next node
     */
    public Node(T data, Node<T> prev) {
        this(data, prev, null);
    }

    /**
     * Construct node with specified data and nodes to link to
     * @param data for node
     * @param next node
     * @param prev node
     */
    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;

        this.prev = prev;

        this.next = next;
    }

    /**
     * Retrieve the data stored in a node
     * @return data in node
     */
    public T getData() {
        return this.data;
    }

    /**
     * Retrieve the next node
     * @return the next node
     */
    public Node<T> next() {
        return this.next;
    }

    /**
     * Retrieve previous node
     * @return the previous node
     */
    public Node<T> prev() {
        return this.prev;
    }

    /**
     * Test if node has next node
     * @return true if node is linked to a next node, false otherwise
     */
    public boolean hasNext() {
        return this.next != null;
    }

    /**
     * Test if node has prev node
     * @return true if node is linked to a previous node, false otherwise
     */
    public boolean hasPrev() {
        return this.prev != null;
    }

    /**
     * Test whether node data is equal to another
     * @param node to test agains
     * @return true if data is equal, false otherwise
     */
    public boolean equal(Node<T> node){
        return this.data == node.data;
    }
}