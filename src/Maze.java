import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    private Square [][] maze;
   
    




    public boolean loadMaze(String filename){
        Scanner scan = new Scanner(System.in);
        int numrows = Integer.parseInt(scan.next());
        scan.next();
        int numcols = Integer.parseInt(scan.next());
        scan.next();

        System.out.println(numrows);

        this.maze = new Square[numrows][numcols];

        for (int row=0; row < numrows; row++) {
            for (int col=0; col < numcols; col++) {
                Square sq = new Square(row,col,scan.next());
                scan.next();
            maze[row][col] = sq;
        }

       
    }

         return true;
    }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = new ArrayList<Square>();

        if (sq.getRow() != 0){
            Square North = new Square(sq.getRow()+ 1, sq.getCol(), maze[sq.getRow()][sq.getCol()+1].getType());
            neighbors.add(North);
        }

        if(sq.getRow() != maze.length){
            Square South = new Square(sq.getRow()- 1, sq.getCol(), maze[sq.getRow()][sq.getCol()+1].getType());
            neighbors.add(South);
        }
        if(sq.getCol() != maze[1].length){
            Square East = new Square(sq.getRow(), sq.getCol() + 1, maze[sq.getRow()][sq.getCol()+1].getType());
            neighbors.add(East);
    }

        if(sq.getCol() != 0){
            Square West = new Square(sq.getRow(), sq.getCol() - 1, maze[sq.getRow()][sq.getCol()+1].getType());
            neighbors.add(West);
        }

        return neighbors;
    }

     
    


}
