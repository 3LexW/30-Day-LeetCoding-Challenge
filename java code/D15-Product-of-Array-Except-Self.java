class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        left[0] = nums[0];
        int[] right = new int[nums.length];
        right[right.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < left.length; i++) left[i] = nums[i] * left[i-1];
        for (int i = right.length - 2; i >= 0; i--) right[i] = nums[i] * right[i+1];
        
        for (int i = 0; i < ans.length; i++){
            int l = (i == 0)? 1:left[i-1];
            int r = (i == ans.length - 1)? 1:right[i+1];
            ans[i] = l*r;
        }
        return ans;
    }
}

/*
Solve by using two arrays left and right, left stores the product from A[0] ... A[i], right stores the product from A[i] ... A[n]
To solve the product except itself without using division, we multiply left[i-1] and right [i+1] then we get the answer
If we reach the end of the array, left[-1] = 1, right[n] = 1
*/
