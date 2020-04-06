class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap();
        
        for (String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c); //After sort, all the anagrams will be the same
            String v = String.valueOf(c);
            
            boolean found = false;
            if (!map.containsKey(v)) map.put(v, new ArrayList<String>());
            map.get(v).add(s);
        }
        
        for (String key: map.keySet()) ans.add(map.get(key));
        return ans;
    }
}
