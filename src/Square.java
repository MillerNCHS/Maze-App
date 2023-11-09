public class Square{
    private final int row;
    private final int col;
    private final int type;
    private char status;
    private Square previous;
    Square(int row, int col, int type){
        this.type = type;
        this.row = row;
        this.col = col;
        this.status = 'o';
        previous = null;
    }
    public int getRow(){
        return row;
    }

    public int getCol(){
        return this.col;
    }

    /**
     *  sets the status of the square to "explored"
     */
    public void explore(){
        this.status = '.';
    }
    /**
     *  sets the status of the square as on the final path to solution
     */
    public void solution(){
        this.status = 'x';
    }
    /**
     *  resets the square to be on the worklist
     */
    public void reset(){
        this.status = 'o';
    }
    public void setStatus(char status){
        this.status = status;
    }
    public char getStatus(){
        return this.status;
    }

    public Square getPrevious() {
        return previous;
    }
    public void setPrevious(Square previous){
        this.previous = previous;
    }

    public int getType(){
        return this.type;
    }
    public String toString(){
        String str = "";
        if (this.type == 0)
            str += "Empty Space";
        if (this.type == 1)
            str += "Empty Space";
        if (this.type == 2)
            str += "Empty Space";
        if (this.type == 3)
            str += "Empty Space";
        
        if (this.status == 'o')
            str += " - On WorkList";
        if (this.status == '.')
            str += " - Has been explored";
        if (this.status == 'x')
            str += " - On Solution Path";

        return str;
        }
}
