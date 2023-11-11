import java.util.ArrayList;
import java.util.NoSuchElementException;

public class  MyStack implements StackADT<Square> {
    private final ArrayList<Square> mazePath;
    MyStack(){
        mazePath = new ArrayList<>();
    }
    @Override
    public void push(Square element){
        mazePath.addFirst(element);
    }
    @Override
    public Square pop() throws NoSuchElementException{
        return mazePath.removeFirst();
    }
    @Override
    public Square top() throws NoSuchElementException{
        return mazePath.getFirst();
    }

    @Override
    public int size() {
        return mazePath.size();
    }

    @Override
    public boolean isEmpty(){
        return size()==0;
    }

    @Override
    public void clear(){
        for(Square i : mazePath){
            i.reset();
        }
    }
}