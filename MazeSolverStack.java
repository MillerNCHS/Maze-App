public class MazeSolverStack extends MazeSolver {
    MyStack<Square> mystack; 
    public MazeSolverStack(Maze maze)
{
    super(maze);
}
public static void main(String[] args){

}
MyStack<Square> stack;
public void makeEmpty(){
    stack = new MyStack<>();

}
public boolean isEmpty(){
    return stack.size() ==0;


}


public MyStack getWorkList(){
    return workList;
}





public void add(Square sq){
    stack.push(sq);
}

public Square next(){
    return stack.pop();
}





    
}
