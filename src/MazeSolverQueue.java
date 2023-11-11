public class MazeSolverQueue extends MazeSolver {

  MyQueue queue;
  MazeSolverQueue(Maze mz){
    super(mz);
  }

  public void makeEmpty(){
    queue = new MyQueue();
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
