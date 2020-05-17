class Solution {
    public int maxSubarraySumCircular(int[] A) {
        //The maximum subarray might be not circular
        //[1,-2,3,-2] -> Solve by kanade algo
        
        //If it is circular, the minimum subarray is included in the middle of the array
        //[5,-3,5] has the minimum subarray -3
        //Total - min = maxsubarray -> (5-3+5)-(-3)=10 -> Max
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int curr1 = 0, curr2 = 0, total = 0;
        
        for (int i = 0; i < A.length; i++){
            curr1 += A[i];
            max = Math.max(max, curr1);
            curr1 = Math.max(curr1, 0); //May starts a new subarray
            
            curr2 += A[i];
            min = Math.min(min, curr2);
            curr2 = Math.min(curr2, 0); //May starts a new subarray
            
            total += A[i];
        }
        
        //In case of corner case: All elements are negative in the array
        return max < 0? max : Math.max(max, total - min);
    }
}
