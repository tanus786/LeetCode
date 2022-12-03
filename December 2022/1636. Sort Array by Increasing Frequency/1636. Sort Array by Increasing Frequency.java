class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else{
                list.add(num);
                map.put(num,1);
            }
        }
        Collections.sort(list,(a,b)->map.get(a)==map.get(b)?(b-a):map.get(a)-map.get(b));
        int arr[]=new int[nums.length];
        int k=0;
        for(int num:list){
            int cnt=map.get(num);
            while(cnt>0){
                arr[k++]=num;
                cnt--;
            }
        }
        return arr;
        
    }
}
