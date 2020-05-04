class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        if (num == 1) return 0;
        
        int ans = 0;
        int pow = 0;
        while (num > 0){
            //Using ^ bitwise operator to reverse the bit, and place them into the correct position
            ans += (((num % 2)^1) * Math.pow(2, pow++));
            num = num >> 1;
        }
        return ans;
    }
}
