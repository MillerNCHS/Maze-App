import java.io.*;
import java.util.*;

public class Maze{

    private Square start;
    private Square finish;
    private Square[][] maze;

    public Maze(){
        this.start = start;
        this.finish = finish;
    }

    public boolean loadMaze (String fname){

        this.maze = new Square[numRows][numCols];
        try{
            Scanner scan = new Scanner(new File(fname))
            
        }
        catch(Exception e){

        }
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                maze[row][col] = null;}  }

        return 
    }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = ArrayList<>();
        Square n1, n2, n3, n4 = null;
        
        neighbors.add(this.maze[sq.row + 1][sq.col]);
        neighbors.add(this.maze[sq.row - 1][sq.col]);
        neighbors.add(this.maze[sq.row][sq.col + 1]);
        neighbors.add(this.maze[sq.row][sq.col - 1]);

        for(Square neighbor: neighbors){
            if (neighbor == null)
                neighbors.remove(neighbor)
        }

        return neighbors;    }

    public Square getStart(){
        return this.start;
    }

    public Square getFinish(){
        return this.finish;
    }

    public void reset(){

    }

    public String toString(){

    }
}