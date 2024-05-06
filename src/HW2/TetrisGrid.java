package HW2;

public class TetrisGrid {
    private boolean[][] grid;
    public TetrisGrid(boolean[][] grid){
        this.grid = grid;
    }
    public void PrintGrid(){
        for (int i=0; i<grid.length; i++) {
            for (int j = 0; j < grid[1].length; j++)
                if (grid[i][j])
                    System.out.print("true");
                else
                    System.out.print("false");
            System.out.println();
        }
    }
    public void clearRows(){
        int row = grid[1].length;
        int col = grid.length;
        for (int i=0; i<row; i++){
            int count = 0;
            for (int j=0; j<col; j++){
                if (grid[j][i]){
                    count ++;
                }
            }
            if (count==col){
                if (i==row-1)
                    for (int c=0; c<col; c++)
                        grid[c][i] = false;
                for (int r=i; r<row-1; r++){
                    for (int c=0; c<col; c++){
                        grid[c][r] = grid[c][r+1];
                    }
                }
            }
        }
    }
//    public static void main(String[] args){
//        boolean[][] table = {
//                {true,true,false},
//                {false,true,false},
//        };
//        TetrisGrid grid = new TetrisGrid(table);
//        grid.clearRows();
//        grid.PrintGrid();
//    }
}
