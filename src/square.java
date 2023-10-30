import java.io.File;

public class square 
{
    private int row;
    private int col;
    private int type;

    public square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getType()
    {
        return type;
    }

    public String toString() 
    {
        switch(type) 
        {
            case 0:
                return "_";
            case 1:
                return "#";
            case 2:
                return "S";
            case 3:
                return "E";
            default:
                return "-1";    
        }
    }
}
