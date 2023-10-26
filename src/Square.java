public class Square {
    int row, col, type;
    
    public Square(int row, int col, int type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public int getRow() { return this.row; }
    public int getCol() { return this.col; }
    public int getType() { return this.type; }

    public String toString() {
        switch(type) {
            // come back to later 
            case 0: 
                return "_";
            case 1: 
                return "#";
            case 2: 
                return "S";
            case 3:
                return "E";
            default:
                return "aoweihfae";
        }
    }
}
