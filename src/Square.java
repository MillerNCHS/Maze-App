public class Square{
    private int row, col;
    private int type;
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
    public void explore(){
        this.status = '.';
    }
    public void solution(){
        this.status = 'x';
    }
    public void reset(){
        this.status = 'o';
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