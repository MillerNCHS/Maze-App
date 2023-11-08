import java.util.ArrayList;

public abstract class MazeSolver {

    protected Maze maze;
    //this has to be a string for some reason? i was originally trying to do an arraylist of arrays. - will
    protected String solutionCoords;

    /**
     * create an empty worklist
     */
    abstract void makeEmpty();

    /**
     * return true of the worklist is empty
     * @return boolean
     */
    abstract boolean isEmpty();

    /**
     * add the given square to the worklist
     * @param sq
     */
    abstract void add(Square sq);

    /**
     * return the "next" item from the worklist
     * @return
     */
    abstract Square next();

    MazeSolver(Maze mz) {

        maze = mz;
        makeEmpty();
        add(maze.getStart());
    }

    public boolean isSolved() {

        return isEmpty() || solutionCoords != null;
    }

    public String getPath() {

        if(solutionCoords == null){
            return "No solution";
        }
        return solutionCoords;
    }

    public Square step(){

    }

    public void solve(){
        while(!isSolved()){
            step();
        }

        this.maze.reset();
    }

}
