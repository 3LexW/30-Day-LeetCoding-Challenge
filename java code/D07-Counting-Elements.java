class Solution {
    public int countElements(int[] arr) {
        int ans = 0;
        HashSet<Integer> h = new HashSet<>();
        for (int n: arr) h.add(n);    
        for (int n: arr) if (h.contains(n+1)) ans++;
        return ans;
    }
}

//Given an integer array arr, count element x such that x + 1 is also in arr.
//If there're duplicates in arr, count them seperately.
//Example: [1,1,2] -> 2, because both 1 can find 2 in the array
