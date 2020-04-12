class Solution {
    public int lastStoneWeight(int[] stones) {
        //First, we create the prioirty queue for the input of the values
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int n : stones) pq.add(n);
        
        while (pq.size() > 1){                //We have 2 or more stones to smash
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            pq.add(Math.abs(stone1-stone2));  //If both smashed, add 0 to pq, eventually the 0's will cancel each other
        }
        return pq.poll();
    }
}
