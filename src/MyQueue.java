import java.util.NoSuchElementException;

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
    /*decided that implementing a counter is probably more efficient and less effort than calculating size evertime
    function is run*/
    int size;

    public MyQueue(){
        size = 0;
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Square element){
        
        Node temp = new Node(element);

        if (this.rear == null) {
            this.front = this.rear = temp;
        }
        else{
            this.rear.next = temp;
            this.rear = temp;
        }
        size++;
    }



    public Square dequeue(){
        
        if (this.front == null)
            throw new NoSuchElementException();
    
        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
        size--;
        return temp.data;
    }
    

    
    public Square front(){
        if(front==null){
            throw new NoSuchElementException();
        }
        return this.front.data;
    }

   
    public int size(){
        return size;
    }
    
    public boolean isEmpty() {
        return(size==0);
    }

    public void clear(){
        
        this.front.data.reset();
        this.rear.data.reset();
    }
}

