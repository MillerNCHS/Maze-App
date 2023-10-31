import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;

public class myQueue implements QueueADT {
    private Queue<Square> squares;
    private Square start;
    private Square end;

    public myQueue() {
        squares = new LinkedList<>();
    }   
    
    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(Square item) {
        end.next = item;
        end = item;
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Square dequeue() throws NoSuchElementException {
        return start;
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    T front() throws NoSuchElementException;

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    int size();

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    boolean isEmpty();

    /**
     * Clear out the data structure
     */
    void clear();


    // Node class
    private class Node {
        public Object data; 
        public Node next;

        public Node(Object x) {
            this.data = x;
            this.next = void;
        }

    }

}