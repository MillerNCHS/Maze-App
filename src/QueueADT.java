import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{    
    private Node<T> first, last;
    public MyQueue()
    {
        this.first = null;
    }
    
    
    
    public void enqueue(T element)
    {
        if(size() == 0)
        {
            first = new Node<T>(element, null);
            last = first;
        }
        
        else
        {
        Node<T> node = new Node<T>(element, null);
        last.next = node;
        this.last = node;
        }
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    T dequeue()

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    T front();

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */


    
    public int size()
    {
        if(last == null && first == null)
        {
            return 0;
        }
        
        Node<T> var = first;
        int i = 1;
        
        while(var.next != null)
        {
            var = var.next;
            //System.out.println(var.data);
            i++;  
        }
        return i;
    }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */


    
    public boolean isEmpty()
    {
        if(this.first==null)
        {
            return true;
        }
        
        return false;
    }

    /**
     * Clear out the data structure
     */


    
    public void clear()
    {
        this.first = null;
        this.last = null;
    }
    
}
