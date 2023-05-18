class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1 = nums[0] * nums[1] * nums[nums.length - 1];
        int product2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(product1, product2);
    }
}
