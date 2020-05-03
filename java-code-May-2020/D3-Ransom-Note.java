class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        //Count the number of characters needed
        for (char c: magazine.toCharArray()) count[c-'a']++;
        
        //Build the ransom note, if any character is missing, return false
        for (char c: ransomNote.toCharArray())
            if (--count[c-'a'] < 0) return false;
        return true;
    }
}
