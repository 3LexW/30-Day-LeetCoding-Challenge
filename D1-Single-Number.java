class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) ans = ans ^ n; // ^ is the bitwise operator of XOR, if two numbers (n) are the same, n ^ n = 0
        return ans;
    }
}
