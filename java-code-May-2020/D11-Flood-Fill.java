class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oriColor = image[sr][sc];
        if (oriColor != newColor){
            dfs(image, sr, sc, oriColor, newColor);
        }
        return image;
    }
    
    public void dfs(int[][] image, int r, int c, int Ori, int New){
        if (r < 0 || c < 0 || r == image.length || c == image[0].length || image[r][c] != Ori) return;
        image[r][c] = New;
        dfs(image, r+1, c, Ori, New);
        dfs(image, r-1, c, Ori, New);
        dfs(image, r, c+1, Ori, New);
        dfs(image, r, c-1, Ori, New);
    }
}
