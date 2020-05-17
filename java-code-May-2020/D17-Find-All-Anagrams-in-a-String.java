class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() == 0) return ans;
        
        int[] count = new int[26];
        //Count the character in p
        for (char c: p.toCharArray()) count[c-'a']++;
        
        //Build the sliding window
        int left = 0;
        int right = 0;
        int total = p.length();
        
        while (right < s.length()){
            //Expand the right side of the window
            //count >= 1 before decrement, it is counted in p
            if (count[s.charAt(right++)-'a']-- >= 1) total--;
           
            //We find an anagram when total reaches 0
            if (total == 0) ans.add(left);
            
            //Slide the left window
            //count >= 0 before increment, it is counted in p
            if (right - left  == p.length() && count[s.charAt(left++)-'a']++ >= 0) total++;
        }
        return ans;
    }
}
