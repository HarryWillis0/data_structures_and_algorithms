<<<<<<< HEAD

=======
/**
 * Test program for ArrayStack.java
 * 
 * @author Harry Willis
 */
>>>>>>> master
public class ArrayStackTest{
    public static void main(String[] args){
        ArrayStack<String> stringStack = new ArrayStack<String>();

        try {
<<<<<<< HEAD
            System.out.println("Stack:\n\t " + stringStack.toString() + "\n");
            System.out.println("Pushing \"hello\", \"this\", \"is\", \"a\", \"stack\", \"that\", \"has\", \"to\", and \"extend\"");
=======
            // toString
            System.out.println("Stack:\n\t " + stringStack.toString() + "\n");
            
            System.out.println("Pushing \"hello\", \"this\", \"is\", \"a\", \"stack\", \"that\", \"has\", \"to\", and \"extend\"");
            // push tests
>>>>>>> master
            stringStack.push("hello");
            stringStack.push("this");
            stringStack.push("is");
            stringStack.push("a");
            stringStack.push("stack");
            stringStack.push("that");
            stringStack.push("has");
            stringStack.push("to");
            stringStack.push("extend");
            
            System.out.println("\nStack:\n\t " + stringStack.toString() + "\n");

<<<<<<< HEAD
            System.out.println("Searching for \"hello\":");
            System.out.println("\t" + stringStack.search("hello"));

            System.out.println("\nSearching for \"doesn't occur\":");
            System.out.println("\t" + stringStack.search("doesn't occur"));
            
=======
            // search occurs test
            System.out.println("Searching for \"hello\":");
            System.out.println("\t" + stringStack.search("hello"));

            // search does not occur test
            System.out.println("\nSearching for \"doesn't occur\":");
            System.out.println("\t" + stringStack.search("doesn't occur"));
            
            // pop tests
>>>>>>> master
            System.out.println("\nPopping 3 elements:");
            System.out.println("\t" + stringStack.pop()+"\n\t" + stringStack.pop() + "\n\t" + stringStack.pop());

            System.out.println("\nStack:\n\t " + stringStack.toString());

<<<<<<< HEAD
            System.out.println("\nStack empty? \n\t" + stringStack.isEmpty());

            System.out.println("\nPeeking at: \n\t" + stringStack.peek());


=======
            // isEmpty test
            System.out.println("\nStack empty? \n\t" + stringStack.isEmpty());

            // peeking test
            System.out.println("\nPeeking at: \n\t" + stringStack.peek());

>>>>>>> master
        } catch (Exception e) {
            System.out.println("Stack is empty");
        }
    }
}