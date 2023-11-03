import java.util.NoSuchElementException;

public class MyQueue<Node> implements QueueADT{

    private Node first;
    private Node last;
    private int size;

    public MyQueue()
    {
        first = null;
        last = null;
    }

 /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(Object item)
        {
            Node insert = new Node();
            insert.data = item;
            if(first == null)
                this.first = insert;
            else 
            {
                this.last.next = insert;
            }
                this.last = insert;
                this.size++;
        
            
            
        }
    

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Object dequeue()
    {
         if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            Object remove = this.first.data;
            this.first = this.first.next;
            this.size--;
            return remove;
        }

    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Object front() throws NoSuchElementException
        {
            if(this.isEmpty())
                throw new NoSuchElementException();
            return this.first.data;
        }

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    public int size()
        {
            return size;
        }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
        {
           return first == null;
        }

    /**
     * Clear out the data structure
     */
    public void clear()
        {
            while(this.isEmpty())
            {
                this.dequeue();
            }
        }

          static class Node
            {
            public Object data;
            public Node next;
            }


}
