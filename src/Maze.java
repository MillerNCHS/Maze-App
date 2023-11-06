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
        try {
            loadMaze("src/maze-1.txt");
        }catch(FileNotFoundException e){
            System.out.println("error opening/processing file");
        }
    }

    public void loadMaze (String fname) throws FileNotFoundException {
        int numRows;
        int numCols;
        Scanner scan = new Scanner(new File(fname));
        //gets the size of the maze
        try{
            numRows = scan.nextInt();
            numCols = scan.nextInt();
            System.out.println(numRows + " " +numCols);
        }
        catch(Exception e){
            return;
        }

        this.maze = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                int val = scan.nextInt();
                maze[row][col] = new Square(row, col, val);
                if(val == 2){

                    start = maze[row][col];
                }else if (val == 3) {
                    finish = maze[row][col];

                }
            }
        }

    }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = new ArrayList<>();
        Square n1, n2, n3, n4 = null;
        
        neighbors.add(this.maze[sq.getRow() + 1][sq.getCol()]);
        neighbors.add(this.maze[sq.getRow() - 1][sq.getCol()]);
        neighbors.add(this.maze[sq.getRow()][sq.getCol() + 1]);
        neighbors.add(this.maze[sq.getRow()][sq.getCol() - 1]);

        neighbors.removeIf(Objects::isNull);

        return neighbors;    }

    public Square getStart(){
        return this.start;
    }

    public Square getFinish(){
        return this.finish;
    }

    public void reset(){
        for (Square[] squares : maze) {
            for (Square i : squares) {
                i.reset();
            }
        }
    }

    public String toString(){
        
        StringBuilder str = new StringBuilder();
        int numCols = maze[0].length;
        for (Square[] squares : maze) {
            for (int col = 0; col < numCols; col++) {
                str.append(squares[col]);
            }
            str.append("\n");
        }
        return str.toString();
    }
}