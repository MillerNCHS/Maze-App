import java.util.ArrayList;
import java.util.*;

public class Maze {
    private Square[][] maze;
    private Square start;
    private Square end;

    /*
     * @param String fname
     */
    public boolean loadMaze(String fname) {
        Scanner in = new Scanner(fname);

        int numRows = Integer.parseInt(in.next());
        int numCols = Integer.parseInt(in.next());

        this.maze = new Square[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (maze[row][col].getType() == 2)
                    start = maze[row][col];
                if (maze[row][col].getType() == 3)
                    end = maze[row][col];
                maze[row][col] = new Square(row, col, Integer.parseInt(in.next()));
            }
        }

        return true;
    }

    public ArrayList<Square> getNeighbors(Square sq) {
        ArrayList<Square> neighbors = new ArrayList<>();

        int row = sq.getRow();
        int col = sq.getCol();
        if (row != 0) // North
            neighbors.add(maze[row - 1][col]);
        if (col != sq.getCol()) // East
            neighbors.add(maze[row][col + 1]);
        if (row != sq.getRow()) // South
            neighbors.add(maze[row + 1][col]);
        if (col != 0) // West
            neighbors.add(maze[row][col - 1]);

        return neighbors;
    }

    public Square getStart() {
        return start;
    }

    public Square getFinish() {
        return end;
    }

    public void reset() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                if (maze[row][col].getType() == 5)
                    maze[row][col].reset();
            }
        }
    }

    public String toString() {
        String str = "";

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                str += maze[row][col].getType();
            }
            str += "\n";
        }

        return str;
    }
}
