class Solution {
    public int countSquares(int[][] matrix) {
        int ans = 0; //Total number of squares
        
        int row = matrix.length;
        if (row == 0) return 0;
        int col = matrix[0].length;
        int[][] dp = new int[row][col]; //dp[i][j] = total squares at (i,j);
        
        //Base cases: first row / first col, if found, it add 1
        for (int i = 1; i < row; i++){
            dp[i][0] = matrix[i][0];
            ans += dp[i][0];
        }
        
        for (int j = 0; j < col; j++){
            dp[0][j] = matrix[0][j];
            ans += dp[0][j];
        }
        
        
        for (int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
                //If the position is 0, no square can be made
                if (matrix[i][j] == 0) dp[i][j] = 0;
                else{
                    //Expand from the bottom right corner, if left / top / top-left has 0, nothing can be created
                    if (dp[i-1][j-1] == 0 || dp[i-1][j] == 0 || dp[i][j-1] == 0) dp[i][j] = 1;
                    //If all 3 direction is not 0, can expand the square, find the shorest possible
                    else dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
                ans += dp[i][j];
            }
        }
        
        return ans;
    }
}
