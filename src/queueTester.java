public class queueTester 
{
    public static void main(String[] args)
    {
        myQueue queue = new myQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(2);
        System.out.println(queue.size());
    }
}