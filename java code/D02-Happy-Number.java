class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();  //HashSet stores the values appeared throughout the calculation
        while (n != 1){
            n = happy(n);
            if (set.contains(n)) return false;    //This is because if a loop exists, the number will never be 1
            else set.add(n);
        }
        return true;
    }
    
    public int happy(int n){  //Obtain the next happy value
        int ans = 0;
        while (n > 0){
            ans += Math.pow(n%10, 2);
            n /= 10;
        }
        return ans;
    }
}
