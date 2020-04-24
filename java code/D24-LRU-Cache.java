class LRUCache {
    //We have to combine a linked list, every time an element is used
    //then move it to the top of the list
    //Remove the last element of the list if capacity if full

    LinkedList<Integer> list;
    HashMap<Integer, Integer> map;
    int capacity;
    int size;
    
    public LRUCache(int capacity) {
        list = new LinkedList<>();
        map = new HashMap<>();
        this.capacity = capacity;
        size = 0;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        else{
            list.removeFirstOccurrence(key);
            list.addFirst(key); //Move it to the head of the list
            return map.get(key);
        }
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            list.removeFirstOccurrence(key);
            list.addFirst(key);
        }
        else if (size == capacity){
            list.addFirst(key);
            map.remove(list.getLast());
            list.removeLast();
        }
        else{
            list.addFirst(key);
            size++;
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
