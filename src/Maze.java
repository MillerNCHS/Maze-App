import java.util.ArrayList;

import java.util.Scanner;

public class Maze {
    private Square[][] maze;
    private int numRows = 0;
    private int numCols = 0;

    public Maze()
    {
    }

    public boolean loadMaze(String fName)
    {

        try(Scanner scan = new Scanner(fName))
        {

        
        scan.next();
        numRows = scan.nextInt();
        scan.next();
        numCols = scan.nextInt();
        
	    this.maze = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		maze[row][col] = null;
    	    	}
         }

	    return true;
        }
        catch (Exception e)
        {
            return false;
        }
        
    }
    
    public ArrayList<Square> getNeighbors(Square sq)
    {

	    ArrayList<Square> neighbors = new ArrayList<>();
	    neighbors.add(maze[sq.getRow()-1][sq.getCol()]);
        neighbors.add(maze[sq.getRow()][sq.getCol()+1]);
        neighbors.add(maze[sq.getRow()+1][sq.getCol()]);
        neighbors.add(maze[sq.getRow()][sq.getCol()-1]);

        return neighbors;
    }

    public Square getStart()
    {

        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		if(this.maze[row][col].getType()==2)
                    {
                        return this.maze[row][col];
                    }
    	    	}
         }
         return null;

    }

    public Square getFinish()
    {

        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		if(this.maze[row][col].getType()==3)
                    {
                        return this.maze[row][col];
                    }
    	    	}
         }
         return null;
    }

    public void reset()
    {
        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		if(this.maze[row][col].getType()==3)
                    {
                        this.maze[row][col].resetSquare();
                    }
    	    	}
         }
    }

    public String toString()
    {
        String out = "";
        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		
                    
                        out+=this.maze[row][col].getType();
                    
    	    	}
                out+="\n";
         }
         return out;
    }
}


