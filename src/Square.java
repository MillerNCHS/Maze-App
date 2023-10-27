public class Square{
    private int row, col;
    private int type;
    Square(int row, int col, int type){
        this.type = type;
        this.row = row;
        this.col = col;
    }
    public int getRow(){
        return row;
    }

    public int getCol(){
        return this.col;
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