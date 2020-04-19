class Solution {
    public int search(int[] nums, int target) {
        //Binary search, but we have to know the number is at which part
        //Separate the array by finding the smallest number in the array
        
        if (nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right){
            int mid = left + (right - left) / 2;
            //If mid point > right, left part is not the smallest
            //If mid point <= right, right part is not the smallest
            if (nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        
        //We have the position of the smallest point
        int pivot = left;
        if (target >= nums[pivot] && target <= nums[nums.length - 1]){
            //We use the right side of the array for binary search
            return binarysearch(nums, target, pivot, nums.length - 1);
        }
        else{
            //We use the left side of the array for binary search (exclude the pivot)
            return binarysearch(nums, target, 0, pivot - 1);
        }
    }
    
    public int binarysearch(int[] nums, int target, int left, int right){
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
