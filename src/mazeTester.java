public class mazeTester 
{
    public static void main(String[] args) 
    {
        maze m = new maze();
        m.loadMaze("src\\maze-2");
        System.out.println(m.getNeighbors(m.squares[1][1]));
        m.getStart();
        m.getFinish();
        m.reset();
        System.out.println(m);

    }
}
