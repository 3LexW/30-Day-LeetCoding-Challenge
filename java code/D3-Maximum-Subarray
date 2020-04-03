class Solution {
    public int maxSubArray(int[] nums) {
        int[] max = new int[nums.length];                         //Store the answers, max[i] = Max subarray sum from nums[0] to nums[i]
        max[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++){
            max[i] = Math.max(nums[i], max[i-1] + nums[i]);       //Either continue the previous array, or start a new array by using nums[i]
            if (max[i] > ans) ans = max[i];
        }
        return ans;
    }
}
