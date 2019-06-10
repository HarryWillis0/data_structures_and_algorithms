/**
 * Test program for SinglyLinkedListTest.java
 * 
 * @author Harry Willis
 */
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("Creating an empty list:");
        SinglyLinkedList<String> stringList = new SinglyLinkedList<String>();

        // toString empty list
        System.out.println("\t" + stringList.toString() + "\n");

        // add to empty list
        System.out.println("Adding \"hello\" to the list:");
        stringList.add("hello");
        System.out.println("\t" + stringList.toString() + "\n");

        // appending to end of list
        System.out.println("Appending \"this\", \"is\", \"a\", \"singly linked\" and \"list\" to the end of the list:");
        stringList.add("this");
        stringList.add("is");
        stringList.add("a");
        stringList.add("singly linked");
        stringList.add("list");
        System.out.println("\t" + stringList.toString() + "\n");

        try {
            // removing the head and tail (with a test of size())
            System.out.println("Removing the head and tail of the list:");
            stringList.remove(0);
            stringList.remove(stringList.size() - 1);
            System.out.println("\t" + stringList.toString() + "\n");

            // adding some things at an index
            System.out.println("Adding \"should\" at index 0 and \"be\" at index 2:");
            stringList.add(0, "should");
            stringList.add(2, "be");
            System.out.println("\t" + stringList.toString() + "\n");

            // setting an item / indexOf test
            System.out.println("Setting \"a\" to \"great\" and \"is\" to \"a\" using indexOf:");
            stringList.set(stringList.indexOf("a"), "great");
            stringList.set(stringList.indexOf("is"), "a");
            System.out.println("\t" + stringList.toString() + "\n");

            // peek
            System.out.println("Peeking at list:\n\t" + stringList.peek() + "\n");

            // swap
            System.out.println("Swapping \"this\" with \"should\":");
            stringList.swap(stringList.indexOf("this"), stringList.indexOf("should"));
            System.out.println("\t" + stringList.toString() + "\n");

            // get
            System.out.println("Getting middle element:\n\t" + stringList.get(stringList.size() / 2) + "\n");

            // invalid index handling
            System.out.println("Getting an invalid index:");
            stringList.get(-11);
            
        } catch (Exception e) {
            System.out.println("\tEmpty list or invalid index\n");
        }

        // contains
        System.out.println("Does list contain \"contains\"?\n\t" + stringList.contains("contains") + "\n");
        System.out.println("Does list contain \"should\"?\n\t" + stringList.contains("should") + "\n");
    }
}