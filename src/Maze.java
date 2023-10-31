import java.io.*;
import java.util.*;

public class Maze{

    private Square start;
    private Square finish;
    private Square[][] maze;

    /**
     * need to change - will
     */
    public Maze(){
        loadMaze("src/maze-1.txt");
        this.start = start;
        this.finish = finish;
    }

    public boolean loadMaze (String fname){
        int numRows = 0;
        int numCols = 0;

        try{
            Scanner scan = new Scanner(new File(fname));
            numRows = scan.nextInt();
            numCols = scan.nextInt();
            System.out.println(numCols + " " +numCols);
        }
        catch(Exception e){
            return false;
        }
        this.maze = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                maze[row][col] = null;}  }

        return true;
    }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = ArrayList<>();
        Square n1, n2, n3, n4 = null;
        
        neighbors.add(this.maze[sq.getRow() + 1][sq.getCol()]);
        neighbors.add(this.maze[sq.getRow() - 1][sq.getCol()]);
        neighbors.add(this.maze[sq.getRow()][sq.getCol() + 1]);
        neighbors.add(this.maze[sq.getRow()][sq.getCol() - 1]);

        for(Square neighbor: neighbors){
            if (neighbor == null)
                neighbors.remove(neighbor);
        }

        return neighbors;    }

    public Square getStart(){
        return this.start;
    }

    public Square getFinish(){
        return this.finish;
    }

    public void reset(){
        for(int row = 0;row< maze.length;row++) {
            for (Square i : this.maze[row]) {
                i.reset();
            }
        }
    }

    public String toString(){
        return "";
    }
}