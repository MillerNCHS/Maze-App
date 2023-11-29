import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * An interface that describes a stack abstract data type
 *
 * @author Benjamin Kuperman (Spring 2005, Spring 2012, Spring 2014)
 */


public class MyStack<Square> implements StackADT<Square> {
    ArrayList<Square> nextSqaure = new ArrayList<>();
    Object first;
    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     * T newT = new T();
        newT.data = element;
        newNode.next = this.first;
        this.first = newT;
     * 
     * 
     */
        
    
    public void push(Square item){
        nextSqaure.add(item);
    }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public Square pop(){
        /*remove the last one */
        Square removed = nextSqaure.remove(nextSqaure.size()-1);
        return removed;
    }
    

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public Square top()
    {
        return nextSqaure.get(nextSqaure.size()-1);
    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size(){
        return nextSqaure.size();
    }

    


    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty(){

        return !(this.first == null);
    }


    /**(
     * Clear out the data structure
     */

    public void clear()
    {
        while(nextSqaure.size()>0)
        {
            nextSqaure.remove(0);
        }
    }
    

}