public class Square{
    private final int row;
    private final int col;
    private char type;
    //private char status;
    private Square previous;
    Square(int row, int col, char type){
        this.type = type;
        this.row = row;
        this.col = col;
        //this.status = 'o';
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
        this.type = '.';
    }
    /**
     *  sets the status of the square as on the final path to solution
     */
    public void solution(){
        this.type = 'x';
    }
    /**
     *  resets the square to be on the worklist
     */
    public void reset(){
        if(this.type != 0 && this.type != 1 && this.type != 2 && this.type != 3){
            setStatus((char) 0);
        }
    }
    public void setStatus(char status){
        this.type = status;
    }
    public char getStatus(){
        return this.type;
    }

    public Square getPrevious() {
        return previous;
    }
    public void setPrevious(Square previous){
        this.previous = previous;
    }

    public char getType(){
        return this.type;
    }
    public String toString(){
        /*
        String str = "";
        if (this.type == 0)
            str += "Empty Space";
        if (this.type == 1)
            str += "wall";
        if (this.type == 2)
            str += "start";
        if (this.type == 3)
            str += "end";
        
        if (this.type == 'o')
            str += " - On WorkList";
        if (this.type == '.')
            str += " - Has been explored";
        if (this.type == 'x')
            str += " - On Solution Path";
        */
        return switch (type) {
            //trying to find a monospace font
            case 0 -> "_";
            case 1 -> "#";
            case 2 -> "S";
            case 3 -> "E";
            case 'o' -> "o";
            case '.' -> "=";
            case 'x' -> "x";
            default -> String.valueOf(type);
        };
    }
}
