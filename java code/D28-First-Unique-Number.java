class FirstUnique {

    HashMap<Integer, Integer> map;      //HashMap stores the count of the numbers
    Queue<Integer> q;                   //Queue stores the order which the number first appears
    
    public FirstUnique(int[] nums) {
        map = new HashMap<>();
        q = new LinkedList<>();
        for (int n: nums) add(n);
    }
    
    public int showFirstUnique() {
        while (!q.isEmpty()){
            if (map.get(q.peek()) == 1) return q.peek();    //Unique number must have a count of 1
            else q.poll();              
            //We can remove it and look for the next value since the question does not remove number
        }
        return -1;  //If queue empty, which means we have no unique number
    }
    
    public void add(int value) {
        if (!map.containsKey(value)){
            map.put(value, 1);
            q.add(value);
        }
        else
            map.put(value, map.get(value) + 1);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
