import java.io.*;
import java.util.*;

public class Maze{

    private Square start;
    private Square finish;
    private int numRows;
    private int numCols;
    private Square[][] data;

    /**
     * need to change - will
     */
    public Maze(){
        start = null;
        finish = null;
        numRows = 0;
        numCols = 0;
        
        
    }

    public boolean loadMaze (String fname) throws FileNotFoundException {
        int numRows = 0;
        int numCols = 0;
        Scanner scan = new Scanner(new File(fname));
        //gets the size of the maze
        try{
            numRows = scan.nextInt();
            numCols = scan.nextInt();
            System.out.println("numRows:" + numRows + " numCols:" +numCols);
        }
        catch(Exception e){
            System.out.println("Couldn't read file");
            return false;
        }

        this.data = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                int val = scan.nextInt();
                data[row][col] = new Square(row, col, (char)val);
                if(val == 2){

                    start = data[row][col];
                }else if (val == 3) {
                    finish = data[row][col];

                }
            }
        }
        return true;

    }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = new ArrayList<>();
        Square n1, n2, n3, n4 = null;
        try{
            neighbors.add(this.data[sq.getRow() + 1][sq.getCol()]);
        }catch(ArrayIndexOutOfBoundsException ignored){}
        try {
            neighbors.add(this.data[sq.getRow() - 1][sq.getCol()]);
        }catch (ArrayIndexOutOfBoundsException ignored){}
        try {
            neighbors.add(this.data[sq.getRow()][sq.getCol() + 1]);
        }catch (ArrayIndexOutOfBoundsException ignored){}
        try{
            neighbors.add(this.data[sq.getRow()][sq.getCol() - 1]);
        }catch (ArrayIndexOutOfBoundsException ignored){}

        neighbors.removeIf(Objects::isNull);

        return neighbors;
    }

    public Square getStart(){
        
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(data[i][j].getType() == 2)
                    start = data[i][j];
            }
        }
        return start;
    }

    public Square getFinish(){
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(data[i][j].getType() == 3)
                    finish = data[i][j];
            }
        }
        return finish;
    }

    public Square[][] getData() {
        return data;
    }

    public void reset(){
        for (Square[] squares : data) {
            for (Square i : squares) {
                i.reset();
            }
        }
    }

    public String toString(){
        
        StringBuilder str = new StringBuilder();
        int numCols = data[0].length;
        for (Square[] squares : data) {
            for (int col = 0; col < numCols; col++) {
                str.append(squares[col]);
            }
            str.append("\n");
        }
        return str.toString();
    }
}