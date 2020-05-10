class Solution {
    public int findJudge(int N, int[][] trust) {
        boolean[][] graph = new boolean[N][N];
        for (int i = 0; i < trust.length; i++){
            graph[trust[i][0] - 1][trust[i][1] - 1] = true;
        } //Record the trust relationships in the town
        
        for (int i = 0; i < N; i++){
            if (con1(graph, i) && con2(graph, i)) return i + 1;
        }
        
        return -1;
    }
    
    public boolean con1 (boolean[][] graph, int i){
        //This is the function to check condition 1
        for (int j = 0; j < graph[i].length; j++)
            if (graph[i][j]) return false;
        
        return true;
    }
    
    public boolean con2 (boolean[][] graph, int j){
        //This is the function to check condition 2
        for (int i = 0; i < graph.length; i++)
            if (i != j && graph[i][j] == false) return false;
        
        return true;
    }
}
