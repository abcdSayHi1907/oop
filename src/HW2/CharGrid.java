package HW2;

public class CharGrid {
    private static char[][] grid;
    public CharGrid(char[][] grid){
        this.grid = grid;
    }
    public static int charArea(char ch){
        int minX = grid[0].length;
        int minY = grid[1].length;
        int maxX = -1;
        int maxY = -1;
        boolean check = false;
        for (int i=0; i<grid[0].length; ++i){
            for (int j=0; j<grid[1].length; ++j){
                if (grid[i][j]==ch){
                    check = true;
                    minX = Math.min(i,minX);
                    minY = Math.min(j,minY);
                    maxX = Math.max(i,maxX);
                    maxY = Math.max(j,maxY);
                }
            }
        }
        if (!check)
            return 0;
        else
            return (maxX-minX+1)*(maxY-minY+1);

    }
    public static int countPlus(){
        int count = 0;
        for(int i = 1; i < grid[0].length - 1; i++){
            for(int j = 1; j < grid[1].length - 1; j++){
                if(grid[i][j] != ' '){
                    int top = 0;
                    int bottom = 0;
                    int left = 0;
                    int right = 0;
                    for (int k = i - 1; k >= 0; k--) {
                        if (grid[k][j] != grid[i][j]) {
                            break;
                        }
                        top++;
                    }
                    for (int k = i + 1; k < grid[0].length; k++) {
                        if (grid[k][j] != grid[i][j]) {
                            break;
                        }
                        bottom++;
                    }
                    for (int k = j - 1; k >= 0; k--) {
                        if (grid[i][k] != grid[i][j]) {
                            break;
                        }
                        left++;
                    }
                    for (int k = j + 1; k < grid[1].length; k++) {
                        if (grid[i][k] != grid[i][j]) {
                            break;
                        }
                        right++;
                    }
                    if(top >=1 && top == bottom && top == right && top == left){
                        count++;
                    }
                }
            }
        }
        return count;
    }
//    public static void main(String[] args){
//        char[][] table = new char[][]{
//                {'c','o','a','c','m'},
//                {'d','f','a','k','m'},
//                {'a','a','a','a','a'},
//                {'c','s','a','l',' '},
//                {' ',' ','a','o',' ' }
//        };
//        CharGrid grid = new CharGrid(table);
//        System.out.println(charArea('c'));
//        System.out.println(countPlus());
//    }
}
