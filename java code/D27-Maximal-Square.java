class Solution {
    public int maximalSquare(char[][] matrix) {
        //We use dynamic programming, if square is 1, it can be either
            //1. Part of the reteangle from top
            //2. Part of the retenagle from left
            //3. Extension of the square from top left
        //Find the minimal one, which is the answer
        
        if (matrix.length == 0) return 0;
        
        int max = 0;
        int row = matrix.length, column = matrix[0].length;
        int[][] dp = new int[row][column];
        
        //Build the base case, first row and first column
        for (int i = 0; i < row; i++){
            dp[i][0] = (matrix[i][0] == '0')? 0:1;
            max = Math.max(dp[i][0], max);
        }
        for (int j = 0; j < column; j++){
            dp[0][j] = (matrix[0][j] == '0')? 0:1;
            max = Math.max(dp[0][j], max);
        }
        
        //Then, build the remaining subproblems
        for (int i = 1; i < row; i++){
            for (int j = 1; j < column; j++){
                //If 0, it is impossible to build the square
                if (matrix[i][j] == '0') dp[i][j] = 0;
                else{
                    //If have zero at top / left / topleft, it is the start of the square
                    if (dp[i-1][j-1] == 0 || dp[i-1][j] == 0 || dp[i][j-1] == 0) dp[i][j] = 1;
                    //Else, it is the bottom right of the smallest square from the extensions
                    else{
                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]);
                    }
                }
                max = Math.max(dp[i][j], max);
            }
        }
                                 
        return max * max; //Return the square of max length
    }
}
