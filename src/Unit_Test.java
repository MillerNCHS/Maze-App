import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit_Test {

    public static void main(String [] args){

        String filename = "src/maze-1";

        Maze test = new Maze();

        if(test.loadMaze(filename)){
            test.getStart();
            test.getFinish();
            test.getNeighbors(test.getStart());

            test.toString();

            test.reset();

            test.tostring();

        }




    }}
