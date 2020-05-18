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

//Method 2: Same as D17's solution
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Using a sliding window to see if the part of the s2 and s1 are anagrams
        int[] count = new int[26];
        for (char c: s1.toCharArray()) count[c-'a']++;
        
        int left = 0;
        int right = 0;
        int total = s1.length();    //If total reaches 0, permutation exists
        
        while (right < s2.length()){
            if (count[s2.charAt(right++) - 'a']-- >= 1) total--;
            if (total == 0) return true; //Found anagram
            if (right - left == s1.length() && count[s2.charAt(left++) - 'a']++ >= 0) total++;
        }
        
        return false;
    }
}
