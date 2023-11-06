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

    public void enqueue(Square element){
        
        Node temp = new Node

        if (this.rear = null) {
            this.front = this.rear = temp;
        }
        else{
            this.rear.next = temp;
            this.rear = temp;
        }
    }



    public void dequeue(){
        
        if (this.front == null)
            return;
    
    Node temp = this.front;
    this.front = this.front.next;

    if (this.front == null)
        this.rear = null;
    
    }
    

    
    public Square front(){

        return this.front.data;
    }

   
    int size(){


    }
    
    boolean isEmpty(){
        if (this.rear = null)
            return true;
    }

    void clear(){
        
        this.front.data.reset();
    }
}

