import java.io.File;

public class myStack implements StackADT<T> {
    

    public myStack() {
        myStack = new ArrayList<>();

    }
    public void push(T item) {
        myStack.add(item);
    }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() {
        if (myStack.isEmpty()) {
            throw new NoSuchElementException;
        }
        else {
            element = myStack.get(0);
            myStack.remove(0);
            return element;
        }
    } 
    

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() {
        if (myStack.isEmpty()) {
            throw new NoSuchElementException;
        }
        else {
            return myStack.get(0);
        }
    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size() {
        return myStack.size();
    }

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    /**
     * Clear out the data structure
     */
    public void clear() {
        myStack.clear();
    }

}