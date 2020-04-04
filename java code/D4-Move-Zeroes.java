class Solution {
    public void moveZeroes(int[] nums) {
        int pivot = 0;                              //Mark the position to place the value
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0)
                nums[pivot++] = nums[i];            //Non zero, put them in the front part of the array
        }
        for (int i = pivot; i < nums.length; i++)
            nums[i] = 0;                            //For the rest, it must be 0s, and will be placed at the end
    }
}
