class Solution {
    public boolean canJump(int[] nums) {
        boolean[] reach = new boolean[nums.length];
        reach[0] = true; //Initial position
        
        for (int i = 0; i < nums.length; i++){
            if (!reach[i]) continue;
            else{
                for (int j = 1; j <= nums[i]; j++){
                    if (i+j == nums.length - 1) return true;
                    else if (i + j < reach.length) reach[i+j] = true;
                }
            }
        }
        
        return reach[reach.length - 1];
    }
}
