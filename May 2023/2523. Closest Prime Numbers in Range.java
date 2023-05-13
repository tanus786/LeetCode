class Solution {
    public boolean prime(int num){
        if(num == 1)
            return false;
        for(int i = 2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int a[]=new int[2];
        a[0]=-1;
        a[1]=-1;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> set = new ArrayList<Integer>();
        for(int i = left ; i<=right ; i++){
            if(prime(i))
                set.add(i);
        }
        for (int i = 0; i < set.size() - 1; i++){
            if((set.get(i+1) - set.get(i))<min){
                a[0]=set.get(i);
                a[1]=set.get(i+1);
                min = set.get(i+1) - set.get(i);
            }
        }
        return a;
    }
}
