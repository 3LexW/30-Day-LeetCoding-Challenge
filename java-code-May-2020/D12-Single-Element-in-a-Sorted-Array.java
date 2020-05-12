class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Simple way, O(n), using ^ operator
        int ans = 0;
        for (int n: nums){
            ans ^= n;
        }
        return ans;
    }
}
