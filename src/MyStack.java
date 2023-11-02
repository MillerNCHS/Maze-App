import java.util.ArrayList;
import java.util.NoSuchElementException;

<<<<<<< HEAD
public class MyStack<T> implements StackADT<T> {

    private ArrayList<T> myStack = new ArrayList<>();

    public T pop() throws NoSuchElementException {
        T element = myStack.remove(size() - 1);
=======

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
>>>>>>> 280b1f100fde27bd9dd6e611e52dc283309deeef
        return element;
    }

    public void push(T item) {
<<<<<<< HEAD
        myStack.add(item);
    }

    public T top() throws NoSuchElementException {
        return myStack.get(size() - 1);

    }

    public int size() {
        return myStack.size();
    }

    public boolean isEmpty() {
        if (myStack.get(0) == null) {
            return true;
        }
        return false;
    }

    public void clear() {
        myStack = new ArrayList<>();

=======
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
>>>>>>> 280b1f100fde27bd9dd6e611e52dc283309deeef
    }

}
