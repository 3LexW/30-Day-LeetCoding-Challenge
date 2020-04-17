class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    fill(grid, i, j);   //Fill all the adjencent 1's to 0, and count them as one island
                }
            }
        }
        return count;
    }
    
    public void fill(char[][] grid, int i, int j){
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        fill (grid, i+1, j);
        fill (grid, i-1, j);
        fill (grid, i, j+1);
        fill (grid, i, j-1);
        return;
    }
}
