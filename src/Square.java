public class Square{
    private final int row;
    private final int col;
    private final int type;
    private char status;
    Square(int row, int col, int type){
        this.type = type;
        this.row = row;
        this.col = col;
        this.status = 'o';
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
    public char getStatus(){
        return this.status;
    }
    public int getType(){
        return this.type;
    }
    public String toString(){
        return switch (type) {
            case 0 -> "_";
            case 1 -> "#";
            case 2 -> "S";
            default -> "E";
        };
    }
}