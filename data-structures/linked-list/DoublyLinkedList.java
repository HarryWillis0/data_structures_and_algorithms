/**
 * A doubly linked list implementation
 * 
 * @author Harry Willis
 */
public class DoublyLinkedList<T extends Object> implements LinkedList<T>{
    
    private Node<T> head;
    
    private Node<T> tail;

    private int size;

    /** 
     * Construct defualt empty list
    */
    public DoublyLinkedList() {
        this.head = new Node<T>();

        this.tail = this.head;

        this.size = 0;
    }

    /**
     * Construct list with specified first item
     */
    public DoublyLinkedList(T item) {
        this.head = new Node<T>(item);

        this.tail = this.head;

        this.size = 1;
    }

    /**
     * add(T item)
     * Appends item to the end of the list
     * @param item to be added
     */
    @SuppressWarnings("unchecked")
    public void add(T item) {
        // add to the empty list
        if (this.size == 0) {
            this.head.setData(item);
       
        // add to the nonempty list
        } else {
            Node<T> newNode = new Node(item, this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        this.size++;
    }
    
    /**
     * add(int index, T item)
     * Inserts item into specified position
     * If index is too large - item is appended to end of list
     * @param index of position 
     * @param item to be added
     * @throws exception if invalid index
     */
    public void add(int index, T item) throws Exception {
        if (index < 0) {
            throw new Exception("Invalid index");
        }

        //cases: index too big & correct index to append to end of list
        if (index >= this.size - 1) {
            this.add(item);
            return;
        }

        Node<T> temp = this.traverse(index);

        Node<T> newNode = new Node<T>(item, temp.prev(), temp);

        // adjust list pointers
        temp.prev().setNext(newNode);
        temp.prev().setPrev(newNode);

        this.size++;
    }

    /**
     * clear()
     * Removes all items from list
     */
    public void clear() {
        this.size = 0;

        this.head = null;

        this.tail = this.head;
    }

    /**
     * contains(T item)
     * Returns true if list contains item
     * @param item to be found
     * @return true if found, false otherwise
     */
    public boolean contains(T item) {
        if (this.size == 0) {
            return false;
        }

        Node<T> temp = this.head;
        while (temp != null) {
            
            if (temp.getData().equals(item)) {
                return true;
            }

            temp = temp.next();
        }

        return false;
    }

    /**
     * get(int index)
     * Returns item at specified position in list
     * @param index of position
     * @return item at position
     * @throws exception if list empty or index out of range.
     */
    public T get(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("List empty");

        }
        
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid index");
        }

        return this.traverse(index).getData();
    }   

    /**
     * indexOf(T item)
     * Returns index of item in list
     * @param item to find
     * @return index of item if found, -1 otherwise
     * @throws exception if list empty
     */
    public int indexOf(T item) throws Exception {
        if (this.size == 0) {
            throw new Exception("List empty");
        }

        Node<T> temp = this.head;
        int index = 0;
        while (temp != null) {
            
            if (temp.getData().equals(item)) {
                return index;
            } 
            
            index++;
            temp = temp.next();
        }
        
        return -1;
    }

    /**
     * peek()
     * Retrieves first item without removing it
     * @return first item
     * @throws exception if list empty
     */
    public T peek() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty.");
        }

        return this.head.getData();
    }

    /**
     * remove(int index)
     * Removes item at specified index
     * @param index of item in list
     * @return the item
     * @throws exception if index invalid or list empty
     */
    public T remove(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("List empty");

        } 
        
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid index");
        }

        Node<T> temp = this.traverse(index);
        // edge cases
        if (index == 0) {
            this.head = this.head.next();
            this.head.setPrev(null);
        
        } else if (index == this.size - 1) {
            this.tail = this.tail.prev();
            this.tail.setNext(null);

        } else {
            temp.next().setPrev(temp.prev());
            temp.prev().setNext(temp.next());
        }
        
        return temp.getData();
    }

    /**
     * set(int index, T item)
     * Replaces element at index with specified item
     * @param index of item to be replaced in list
     * @param item to replace with
     * @return item previously in list
     * @throws exception if invalid index or list empty
     */
    public T set(int index, T item) throws Exception {
        if (this.size == 0) {
            throw new Exception("List empty");

        }
        
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid index");
        }

        Node<T> temp = this.traverse(index);
        
        T tempData = temp.getData();

        temp.setData(item);
        
        return tempData;
    }

    /**
     * swap(int i, int j)
     * Swaps the elements at positions i and j
     * @throws exception if list empty or invalid indices
     */
    public void swap(int i, int j) throws Exception {
        if (this.size == 0) {
            throw new Exception("List empty");

        } else if (i < 0 || i >= this.size || j < 0 || j >= this.size || i == j) {
            throw new Exception("Invalid index(s)");
        }

        // temps
        Node<T> tempI = this.traverse(i);
        T tempIData = tempI.getData();
        Node<T> tempJ = this.traverse(j);

        tempI.setData(tempJ.getData());

        tempJ.setData(tempIData);
    }

    /**
     * size()
     * Retrieve number of elements in list
     * @return number of elements in list
     */
    public int size() {
        return this.size;
    }

    /**
     * toString()
     * Retrieve list in string form 
     * @return String representation of list
     */
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }

        String s = "[" + this.head.getData();
        
        Node<T> temp = this.head;
        while (temp.next() != null) {
            temp = temp.next();
            s += ", " + temp.getData();
        }
        
        return s += "]";
    }

    /**
     * Helper method that traverses the list to a specified index
     * @param index to traverse to
     * @return node at index
     */
    private Node<T> traverse(int index) {
        Node<T> temp = this.head;

        if (index == 0) {
            return this.head;
        }
        
        while (index-- > 0 && temp.next()  != null) {
            temp = temp.next();
        }
        
        return temp;
    }
}