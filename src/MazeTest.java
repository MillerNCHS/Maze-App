
public class MazeTest {
    public static void main(String[] args){
    Maze maze = new Maze();
    System.out.println(maze.loadMaze("src\\maze-2"));
    System.out.println(maze.getNeighbors(0,0));
    System.out.println(maze.getStart());
    System.out.println(maze.getFinish());
    System.out.println(maze.toString());
    }
}

