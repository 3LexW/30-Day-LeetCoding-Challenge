class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        //If m and n shares the same prefix in binary representation
        //The rest of the numbers between them must share the same binary representation
        //For the postfix it must contains 0 in the position in the number x where m < x < n
        
        int i = 0;
        for (; m != n; ++i){
            m >>= 1;
            n >>= 1;
        }
        
        return m << i;
    }
}
