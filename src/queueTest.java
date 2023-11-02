public class queueTest {

    public static void main(String[] args)
    {
        Square a = new Square(0, 0, 0);
        Square b = new Square(1, 0, 1);
        Square c = new Square(2, 0, 2);
        Square d = new Square(3, 0, 3);
        Square e = new Square(4, 0, 4);

        myQueue q = new myQueue();
        q.enqueue(a);
        q.enqueue(b);
        q.enqueue(c);
        q.enqueue(d);
        q.enqueue(e);

        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.dequeue());

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println("Clearing data...");
        q.clear();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
    
}
