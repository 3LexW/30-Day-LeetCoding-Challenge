class Solution {
    public boolean isPerfectSquare(int num) {
        //Consider a perfect square, start from top left
        //1 -> 4 (+3) -> 9 (+5) -> 16 (+7) ...
        int sq = 1;
        while (num > 0){
            num -= sq;
            sq += 2;
        }
        return num == 0;
    }
}
