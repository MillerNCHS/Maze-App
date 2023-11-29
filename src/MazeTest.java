public class MazeTester {

    public static void main(String[] args){
        Maze mz = new Maze();
        System.out.println(mz.loadMaze("src/maze-1"));
        System.out.println(mz.getStart());
        System.out.println(mz.getFinish());
        System.out.println(mz.getNeighbors(mz.getStart()));
    }
}
