import java.util.NoSuchElementException;
import java.util.Stack; 

public class MyStack implements StackADT {

    private Stack <Square> squares; 

    public Square pop() throws NoSuchElementException
    {
        Square element = squares.remove(size()-1); 
        return element; 
    }

    public void push(Square item)
    {
        squares.add(item); 
    }

    public Square top() throws NoSuchElementException
    {
        Square element = squares.remove(size()-1); 
        squares.add(size(), element);
        return element;
        
    }

    public int size()
    {
        
    }

    public boolean isEmpty()
    {

    }

    public void clear()
    {

    }
    
    
}
