class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        //Using two for loops, first, record the counts
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        //Then, search from the beginning of the string, if count is 1, return the index
        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) == 1) return i;
        }
        
        //If not exist
        return -1;
    }
}
