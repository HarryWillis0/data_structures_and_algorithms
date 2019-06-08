/**
 * Test program for ArrayStack.java
 * 
 * @author Harry Willis
 */
public class ArrayStackTest{
    public static void main(String[] args){
        ArrayStack<String> stringStack = new ArrayStack<String>();

        try {
            // toString
            System.out.println("Stack:\n\t " + stringStack.toString() + "\n");
            
            System.out.println("Pushing \"hello\", \"this\", \"is\", \"a\", \"stack\", \"that\", \"has\", \"to\", and \"extend\"");
            // push tests
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

            // search occurs test
            System.out.println("Searching for \"hello\":");
            System.out.println("\t" + stringStack.search("hello"));

            // search does not occur test
            System.out.println("\nSearching for \"doesn't occur\":");
            System.out.println("\t" + stringStack.search("doesn't occur"));
            
            // pop tests
            System.out.println("\nPopping 3 elements:");
            System.out.println("\t" + stringStack.pop()+"\n\t" + stringStack.pop() + "\n\t" + stringStack.pop());

            System.out.println("\nStack:\n\t " + stringStack.toString());

            // isEmpty test
            System.out.println("\nStack empty? \n\t" + stringStack.isEmpty());

            // peeking test
            System.out.println("\nPeeking at: \n\t" + stringStack.peek());

        } catch (Exception e) {
            System.out.println("Stack is empty");
        }
    }
}