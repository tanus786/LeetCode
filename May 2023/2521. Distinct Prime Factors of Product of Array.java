class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Arrays.sort(nums);
		HashSet<Integer> set= new HashSet<>();
		for (int n :nums) {			
			int i=2;
            while(n>1) {
				if(n % i ==0) {
					set.add(i);
					n/=i; }
				else
                    i++;
            }
        }
        return set.size();
    }
}
