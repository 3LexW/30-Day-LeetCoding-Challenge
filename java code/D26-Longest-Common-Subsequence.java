class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //We use a dynamic programming approach
        int [][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < text1.length() + 1; i++){
            for (int j = 1; j < text2.length() + 1; j++){
                char c1 = text1.charAt(i-1);
                char c2 = text2.charAt(j-1);
                //Case 1: Two subsequence have same length, extension from top left
                if (c1 == c2){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                //Case 2: Not the same, then find the max from top of left
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[text1.length()][text2.length()];
    }
}
