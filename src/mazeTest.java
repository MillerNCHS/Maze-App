import java.io.File;
import java.util.ArrayList;

public class mazeTest {

    public static void main(String[] args) {
        // Square sq = new Square(1, 1, 1);
        Maze maze = new Maze();
        maze.loadMaze("src/maze-1");

        System.out.println(maze.toString());

        System.out.println(maze.getNeighbors(maze.getStart()));

        System.out.println(maze.getStart());
        System.out.println(maze.getFinish());

        maze.reset();
        System.out.println(maze.toString());

    }

}