public class MazeSolverStack extends MazeSolver{
    private MyStack worklist;
    MazeSolverStack(Maze mz){
        super(mz);
        worklist = new MyStack();
    }
    public void makeEmpty(){
        worklist.clear();
    }

    /**
     * return true of the worklist is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return worklist.isEmpty();
    }

    /**
     * add the given square to the worklist
     * @param sq
     */
    public void add(Square sq){
        worklist.push(sq);
    }

    /**
     * return the "next" item from the worklist
     * @return
     */
    public Square next(){
        return worklist.pop();
    }
}
