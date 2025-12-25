import java.util.*;
import java.io.*;

class maze
{
    public square[][]  squares;

    
    private square start;
    private square finish;
    private String current = null;


    
    public maze(){
    }

    public boolean loadMaze(String fname)
    {
        boolean tf = false;

        
        try
        {
            File file = new File(fname);
            Scanner scan = new Scanner(file);
            String[] dimension = scan.nextLine().split(" ");
            int numRows = Integer.parseInt(dimension[0]);
            int numCols = Integer.parseInt(dimension[1]);
            squares = new square[numRows][numCols];


            for (int row = 0; row < numRows; row++)
            {            
                String[] s = scan.nextLine().split(" ");
                for (int col = 0; col < numCols; col++)
                {
                    squares[row][col] = new square(row, col, Integer.parseInt(s[col]));
                
                if (squares[row][col].getType() == 2)
                    start = squares[row][col];
                else if (squares[row][col].getType() == 3)
                    finish = squares[row][col];
                }
            }
            tf = true;
            return tf;

        }
        catch(Exception e)
        {
            System.out.println("There was a problem loading the maze file");
            tf = false;
            return tf;
            //throw new FileNotFoundException();
        }
    }



    
    public ArrayList<square> getNeighbors(square sq)
    {
        ArrayList<square> neighbors = new ArrayList<square>();

        if(sq.getRow() != 0) neighbors.add(squares[sq.getRow() - 1][sq.getCol()]);
        
        if(sq.getRow() != squares.length - 1) neighbors.add(squares[sq.getRow() + 1][sq.getCol()]);
        
        if(sq.getCol() != 0) neighbors.add(squares[sq.getRow()][sq.getCol() - 1]);
        
        if(sq.getCol() != squares[0].length - 1) neighbors.add(squares[sq.getRow()][sq.getCol() + 1]);

        return neighbors;
    }



    
    public square getStart()
    {
        return start;
    }

    
    public square getFinish()
    {
        return finish;
    }

    
    public void reset()
    {
        if (current != null) loadMaze(current);
    }

    
    public String toString()
    {
        String string = "";
        for (square[] row: squares)
        {
            for (square square: row)
            {
                string += square + " ";
            }
            string += "\n";
        }

        return string;
    }

}