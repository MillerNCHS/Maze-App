import java.io.*;
import java.util.*;

public class MazeTest{

    // this test should:
    // load a maze from one of the supplied files
    // get the neighbours of some specific square (the start square, for example)
    // assert that (1) there are the correct number of neighbours, and (2) the neighbours are in the correct locations
    // print out the maze
    // confirm your getStart and getFinish methods return the correct squares

    public static void main(String[] args){

        //File file = new File(".");
        //for(String fileNames : file.list()) System.out.println(fileNames);

        Maze maze = new Maze();
        /*
         *  3 3
            2 0 0
            0 0 0
            0 0 3
         */



        // Checking getStart and getFinish
        Square tempStart = maze.getStart();
        Square tempFinish = maze.getFinish();

        System.out.println("start coords" + tempStart.getCol() + " " + tempStart.getRow());
        System.out.println("finish coords" + tempFinish.getCol() + " " + tempFinish.getRow());

        // Checking Neighbors (start, center, one corner)
        maze.getNeighbors(maze.getStart());

        maze.getNeighbors(maze.getData()[1][1]);

        maze.getNeighbors(maze.getData()[0][2]);


        //printing toString
        System.out.println(maze);
        /*
         * toString Method for MAZE
        
        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                System.out.print(maze[row][col]);}  System.out.println("")}
        
                */

        /*
         * size Method for QUEUE
        
        Node nextNode = front.next;
        int size = 0;
        while(nextNode != null){
            size++;
            nextNode = nextNode.next;
        }

                */


    }

}