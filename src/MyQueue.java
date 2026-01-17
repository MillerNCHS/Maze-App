
public class MyQueue<Square> implements QueueADT<Square>
{
    private Node head;
    private Node tail;
    private int size;
    public MyQueue()
    {
        head = new Node();
        tail = new Node();
        size = 0;
        
        head.data = null;
        tail.data = null;
        head.next = tail;
        tail.next = null;
    }

    public void enqueue(Square item)
    {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next=this.head;
        this.head = newNode;
        size++;
    }

    public Square dequeue()
    {
        if (head == null)
            return null;
        Square element = head.data;
        head = head.next;
        if (head == null)    
        {
            tail = null;
        }
        return element;
    }

    public Square front()
    {
        return head.data;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(head.data==null)
        {
            return true;
        }
        return false;
    }

    public void clear()
    {
        head.data = null;
        head.next = tail;
        tail.data = null;
    }

    class Node
    {
        public Square data;
        public Node next;
    }

}
