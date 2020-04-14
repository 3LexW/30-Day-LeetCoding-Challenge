class Solution {
    public String stringShift(String s, int[][] shift) {
        int count = 0;
        for (int[] sh: shift){
            if (sh[0] == 0) count -= sh[1];
            else count += sh[1];
        } //Left rotation and right rotation cancels each other
        
        if (count < 0)  //Left rotation
            return s.substring(Math.abs(count) % s.length()) + s.substring(0, Math.abs(count) % s.length());
        else{           //Right rotation
            int n = s.length() - Math.abs(count) % s.length();
            return s.substring(n) + s.substring(0,n);
        }
    }
}
