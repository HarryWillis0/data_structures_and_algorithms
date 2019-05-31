public class ArrayQueueTest {
    public static void main(String[] args){
        ArrayQueue<Integer> intQueue = new ArrayQueue<Integer>();
        try {
            System.out.println(intQueue.toString());

            System.out.println("Enqueuing \"1\", \"-40\", \"666\" \"0\", \"999\", and \"123456\"");
            
            intQueue.enqueue(1);
            intQueue.enqueue(-40);
            intQueue.enqueue(666);
            intQueue.enqueue(0);
            intQueue.enqueue(999);
            intQueue.enqueue(123456);

            System.out.println("Queue now:\n\t" + intQueue.toString());

            System.out.println("Dequeuing:\n\t" + intQueue.dequeue());

            System.out.println("Polling:\n\t" + intQueue.poll());

            System.out.println("Queue now:\n\t" + intQueue.toString());

            System.out.println("Dequeuing 5 elements:\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue());

            System.out.println("Is queue empty?\n\t" + intQueue.isEmpty());

            System.out.println("Queue now:\n\t" + intQueue.toString());
        
        
        } catch (Exception e) {
            System.out.println("Queue empty");
        }

    }
}