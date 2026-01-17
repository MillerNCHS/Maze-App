public class QueueTest {
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
        Object o1 = "hi";
        Object o2 = "bye";
        queue.enqueue(o1);
        queue.enqueue(o2);
        System.out.println(queue.size());
        System.out.println(queue.front());
        queue.dequeue();
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.size());
    }
}
