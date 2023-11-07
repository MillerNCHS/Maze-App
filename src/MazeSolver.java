public abstract class MazeSolver {
    
    protected Maze maze;

    abstract void makeEmpty(){


    }

    abstract boolean isEmpty(){
        
    }

    abstract void add(Square sq){
        
    }

    abstract Square next(){
    
    }

    MazeSolver(Maze mz){

        maze = mz;
        makeEmpty();
        add(maze.getStart());
    }

    public boolean isSolved(){

        boolean sol = false;

        if ()
    }

    public String getPath()[

        for (int i = 0; i < size(); i++)
            
    ]

    public Square step(){

    }

    public void solve(){

    }

}
