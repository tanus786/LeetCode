class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int[] Arr = new int[n+1];
        Arr[0]=0;
        Arr[1]=1;
        Arr[2]=2;

        for(int i =3;i<Arr.length;i++){
            Arr[i]= Arr[i-1]+Arr[i-2];
        }
        return Arr[n];

    }
}
