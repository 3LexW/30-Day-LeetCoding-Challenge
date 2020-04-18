class Solution {
    public int minPathSum(int[][] grid) {
        //We will use dynamic programming for this case
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        
        //First row = sum of row, First col = sum of the column
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) dp[0][i] = grid[0][i] + dp[0][i-1];
        for (int i = 1; i < m; i++) dp[i][0] = grid[i][0] + dp[i-1][0];
        
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){'
                //Minimum step to reach the path = minimum from top or left, since the question only allows move down or right
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[m-1][n-1];
    }
}
