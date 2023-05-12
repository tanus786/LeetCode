class Solution {
    public int smallestValue(int n) {
        if(n<=5)
            return n;
        while(prime(n) == false){
            int sum =0;
            for(int i =2;i<=n;i++){
                if(prime(i)){
                    while(n%i==0){
                    sum+=i;
                    n/=i;
                    }
                }
            }
            n = sum;
        }
        return n;
    }
    public boolean prime(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}


## 2nd Solution


class Solution {
    public int smallestValue(int n) {
        int ans =0;
        while(true){
            int sum =0;
            for(int i =2;i<=n;i++){
             if(prime(i)){
                while(n%i==0){
                    sum+=i;
                    n/=i;
                }
             }
        }
        if(ans==sum)
             break;
        else
             ans = sum;
          n = sum;
     } 
     return ans;
    }
    public boolean prime(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}



