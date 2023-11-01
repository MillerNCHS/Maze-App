import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyStack<T> implements StackADT<T> {

    private Stack<Square> squares;
    private ArrayList <T> myStack = new ArrayList<>(); 

    public T pop() throws NoSuchElementException {
        T element = myStack.remove(size() - 1);
        return element;
    }

    public void push(T item) {
        myStack.add(item);
    }

    public T top() throws NoSuchElementException
    {
        return myStack.get(size()-1);
        
    }

    public int size()
    {
        return myStack.size(); 
    }

    public boolean isEmpty()
    {
        if (myStack.get(0)==null)
        {
            return true; 
        }
        return false; 
    }

    public void clear()
    {
        myStack = new ArrayList<>(); 

    }

}
