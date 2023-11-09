import java.util.ArrayList;
import java.util.Stack;

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

        return isEmpty() || (solutionCoords != null && next().getType() == 3);
    }

    public String getPath() {

        if(solutionCoords == null){
            return "No solution";
        }
        return solutionCoords;
    }

    public Square step(){
        Square current = null;
        ArrayList<Square> neighbors;
        //Is the worklist empty? If so, the exit is unreachable; terminate the algorithm.
        if(!isEmpty()){
            //Otherwise, grab the "next" location to explore from the worklist.
            current = next();

            //Does the location correspond to the exit square? If so, the finish was reachable; terminate the algorithm and output the path you found.
            if(current.getType()==3){
                //recant current worklist into a stack
                Stack<Square> finalPath = new Stack<>();
                Square iter = current.getPrevious();
                while(iter.getType() != 2){
                    finalPath.push(iter);
                    iter.solution();
                    iter = iter.getPrevious();

                }

                //generating output string...
                StringBuilder sol = new StringBuilder();
                while(!finalPath.isEmpty()){
                    iter = finalPath.pop();
                    sol.append("(").append(iter.getCol()).append(", ").append(iter.getRow()).append("), ");
                }
                solutionCoords = new String(sol);
                return current;
            }

            //normal behavior
            //compute all the adjacent up, right, down, left locations that are inside the maze and aren't walls, and
            neighbors = maze.getNeighbors(current);
            for(Square s : neighbors){
                //checks if neighboring square is clear, adds to worklist
                //add them to the worklist for later exploration provided they have not previously been added to the worklist.
                if(s.getType()==0){
                    s.setPrevious(current);
                    s.setStatus('o');
                    add(s);
                }else if(s.getType()==3){
                    s.setPrevious(current);
                    add(s);
                    break;//should skip to next step and compute ending directly ideally
                }
            }
            if(current.getStatus()=='o') {
                current.setStatus('.');
            }
        }
        //returns the square stepped
        return current;
    }

    public void solve(){
        while(!isSolved()){
            step();
        }

        this.maze.reset();
    }

}
