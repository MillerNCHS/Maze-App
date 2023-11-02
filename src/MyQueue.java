class Node{
    Square data;
    Node next;
     Node(Square content){
        this.data = content;
        this.next = null;
    }
}
public class MyQueue implements QueueADT<Square>{
    Node front, rear;
    public MyQueue(){
        this.front = null;
        this.rear = null;
    }
}
