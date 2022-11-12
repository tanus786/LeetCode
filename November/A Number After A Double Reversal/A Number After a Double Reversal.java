class Solution {
    public boolean isSameAfterReversals(int num) {
        return num==0 || num%10!=0;
    }
}

## solution 2
  
  
  class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int sum =0, rem=0;
        while(n!=0){
            rem = n%10;
            sum = sum *10 +rem;
            n = n/10;
        }
        int sum2=0;
        while(sum!=0){
            rem = sum%10;
            sum2 = sum2 *10 +rem;
            sum = sum/10;
        }
        if(sum2 == num)
            return true;
        else
            return false;

    }
}
