public class MazeSolverQueue extends MazeSolver {
    MyStack<Square> myqueue; 
    public MazeSolverStack(Maze maze)
{
    super(maze);
}
public static void main(String[] args){

}
MyStack<Queue> queue;
public void makeEmpty(){
    stack = new Queue<>();

}
public boolean isEmpty(){
    return queue.size() ==0;


}


public Myqueue getWorkList(){
    return workList;
}





public void add(Square sq){
    queue.enqueue(sq);
}

public Square next(){
    return queue.dequeue();
}





    
}
