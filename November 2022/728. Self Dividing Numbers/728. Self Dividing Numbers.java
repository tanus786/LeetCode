class Solution {
    public static int test(int n){
        int m = n;
        int rem=1;
        while(n!=0){
            rem = n%10;
            if(rem == 0) return 0;;
            if(m % rem != 0)
                return 0;
            n = n/10;
        }
        return 1;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = left; i<=right;i++){
            if(i<=9){
                arr.add(i);
            }
            else{
                int n = test(i);
                if(n==1)
                    arr.add(i);
            }
        }
        return arr;
    }
}
