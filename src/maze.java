import java.util.ArrayList;

public class maze 
{
    private square maze[][];

    public boolean loadMaze(String fName)
    {
        this.maze = new Square[numRows][numCols];

        for (int row=0; row < numRows; row++) 
        {
            for (int col=0; col < numCols; col++)  
            {
                maze[row][col] = null;
            }
        }
    }

    public ArrayList<square> getNeighbors(square sq)
    {

    }

    public square getStart() {

    }
    public square getFinish() {

    }

    public void reset() {

    }

    public String toString() {
        
    }
}
