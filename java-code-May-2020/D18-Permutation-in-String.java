class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Using a sliding window to see if the part of the s2 and s1 are anagrams
        int left = 0;
        int right = 0;
        while (right <= s2.length()){
            if (isAnagram(s1, s2.substring(left, right))) return true;
            right++;
            if (right - left > s1.length()) left++;
        }
        return false;
    }
    
    public boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (char c: s2.toCharArray()) count[c-'a']++;
        for (char c: s1.toCharArray()){
            if (--count[c-'a'] < 0) return false;
        }
        return true;
    }
}
