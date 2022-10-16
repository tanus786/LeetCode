import java.util.HashSet;
class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        int count =0;
        int reverse =0;
        int t=0;
        for(int i =0; i<nums.length;i++){
            myNumbers.add(nums[i]);
            while(nums[i] != 0){  
                int remainder = nums[i] % 10;  
                reverse = reverse * 10 + remainder;  
                nums[i] = nums[i]/10; 
            }
                myNumbers.add(reverse);
                reverse = 0;
            }
    
        HashSet<Integer> hset = new HashSet<Integer>(myNumbers);
return hset.size();
        

    }
}