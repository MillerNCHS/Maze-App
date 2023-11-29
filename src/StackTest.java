public class StackTest {
    public static void main(String[] args)
    {
    MyStack stack = new MyStack<>();
    Square newT = new Square( 2,2,2);
    Square newT2 = new Square(4,4,4);
    stack.push(newT);
    stack.push(newT2);
    stack.pop();
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
    
    



}
}