import java.util.ArrayList;
import java.util.NoSuchElementException;


public class MyStack<T> implements StackADT<T> {

    private ArrayList <T> myStack; 
    int size = 0; 

    public MyStack()
    {
        this.myStack = new ArrayList<>();
    }

    public T pop() throws NoSuchElementException {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        T element = myStack.remove(size() - 1);
        size--;
        return element;
    }

    public void push(T item) {
        size++;
        myStack.add(item);
    }

    public T top() throws NoSuchElementException
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        return myStack.get(size()-1);
        
    }

    public int size()
    {
        return size; 
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

    public String toString()
    {
        String display = "["; 
        for (T x: this.myStack)
        {
            display+=x+" "; 
        }
        display += " "; 

        return display; 
    }

}
