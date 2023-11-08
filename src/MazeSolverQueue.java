public class MazeSolverQueue extends MazeSolver {

  MyQueue queue;
  MazeSolverQueue(){
    super(new Maze()); 
    queue = new MyQueue();
  }

  public void makeEmpty(){
    queue.clear();
  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public void add(Square sq){
    queue.enqueue(sq);
  }

  public Square next(){
    return queue.dequeue();
  }

}
