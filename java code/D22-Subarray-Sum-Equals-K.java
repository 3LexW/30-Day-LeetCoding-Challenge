class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0 || nums == null) return 0;
        
        int ans = 0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        if (sum[0] == k) ans++;
        

        for (int i = 1; i < sum.length; i++){
            sum[i] = nums[i] + sum[i-1];
            if (sum[i] == k) ans++;
        }

        for (int i = 0; i < sum.length - 1; i++){
            for (int j = i + 1; j < sum.length; j++){
                if (sum[j] - sum[i] == k) ans++;
            }
        }
        
        return ans;    
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for (int n: nums){
            sum += n;
            if (map.containsKey(sum - k)) ans += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return ans;
    }
}
