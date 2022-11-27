class Solution {
    public int subarraySum(int[] nums, int k) {
        int res =0;
        for(int i =0;i<nums.length;i++){
            int sum =0;
            for(int j =i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k)res++;
            }
        }
        return res;
    }
}

##shows TLE
##Second solution

int[] sums = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            sums[i + 1] = sum;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            int pre = sums[i];
            for (int j = i; j < nums.length; j ++) {
                int tmp = sums[j + 1] - pre;
                if (tmp == k) {
                    count ++;
                }
            }
        }
        return count;
        
        
##3rd solution




int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;

