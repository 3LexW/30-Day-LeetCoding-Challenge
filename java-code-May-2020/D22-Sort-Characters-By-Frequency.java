class Solution {
    public String frequencySort(String s) {
        //Count the frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        
        //Use heap sort to sort the characters, based on the frequency
        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b) -> map.get(b) - map.get(a));
        for (char c: map.keySet()) pq.add(c);
        
        //Build the string by remove the head of the heap, and append the char's frequency
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            char c = pq.remove();
            for (int i = 0 ; i < map.get(c); i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
