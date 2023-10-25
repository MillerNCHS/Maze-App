public class Square{
    private Square previous;
    private int row, col, type;
    public boolean explored, onPath, isCurrent;

    public Square(Square previous, int row, int col, int type){
        this.row = row;
        this.col = col;
        this.type = type;
        this.previous = previous;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public int getType(){
        return this.type;
    }

    public String toString(){
        if(isCurrent){
            return "o";
        }
        if(onPath){
            return "x";
        }
        if(explored){
            return ".";
        }
        switch(type){
            case 0:
                return " ";
            case 1:
                return "#";
            case 2:
                return "S";
            case 3:
                return "E";
        }
    }
}