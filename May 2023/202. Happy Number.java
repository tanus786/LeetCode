class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int rem,sum =0;
        set.add(n);
        while(n!=1){
            sum = 0;
            while(n!=0){
                rem = n%10;
                sum+= rem*rem;
                n = n/10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
