class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //K: Count, V: Last time the same value exists
        
        //If the same value exists, which mean the array between the two index has the same number of 0 and 1
        map.put(0, -1);
        
        for (int i = 0; i < nums.length; i++){
            count += (nums[i] == 0)? -1 : 1;
            if (map.containsKey(count)) max = Math.max(max, i-map.get(count));
            else map.put(count, i);
        }
        
        return max;
    }
}
