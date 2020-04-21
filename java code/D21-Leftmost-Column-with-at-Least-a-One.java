/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    int m, n;
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        //First, obtain the size of the entire matrix
        m = binaryMatrix.dimensions().get(0);
        n = binaryMatrix.dimensions().get(1);
        
        //Since the matrix is sorted row by row, we find the left most value which has 1
        //Then we update the answer
        
        int ans = n;
        for (int i = 0; i < m; i++){
            int cur = binarysearch(binaryMatrix, i);
            ans = (cur < ans)? cur : ans;
        }
            
        return (ans == n)? -1 : ans;
    }
    
    public int binarysearch(BinaryMatrix binaryMatrix, int row){
        int left = 0, right = n-1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (binaryMatrix.get(row, mid) == 0){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return (binaryMatrix.get(row, left) == 0)? n : left;
    }
}
