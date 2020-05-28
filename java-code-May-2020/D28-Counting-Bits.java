class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        int sig = 1;    //The most significant binary digit, must be 1
        
        for (int i = 0; i <= num; i++){
            if (i == 0) ans[i] = 0;
            else if (i == sig){
                ans[i] = 1;     //Increase the significant number, ans = 1
                sig *= 2;
            }
            //The number will be the half of the number, plus the remaining number
            //For example, 10 will be the combination of 8, and 2
            else ans[i] = ans[sig/2] + ans[i - (sig / 2)];
        }       
        
        return ans;
    }
}
