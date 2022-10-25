class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        Set<List<Integer>> result  = new HashSet<>();
        
        if (arr == null || arr.length < 3)
            return new ArrayList<>(result);
       
        Arrays.sort(arr);									// Sort the elements

        int size = arr.length;
        
	    for (int i = 0; i < size - 2; i++)				// Now fix the first element and find the other two elements
	    {
	        // To find the other two elements, start two index variables
	        // from two corners of the array and move them toward each other
	        int left = i + 1;
			int right = size - 1;
	        
	        while (left < right)
	        {
                int sum =  arr[i] + arr[left] + arr[right];
                
	            if (sum == 0)
	            {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
	            }
	            else if (sum < 0)
	                left++;
	            else 													
	                right--;
	        }
	    }
        return new ArrayList<>(result);
    }
}


