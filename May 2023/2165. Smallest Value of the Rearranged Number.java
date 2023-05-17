class Solution {
    public long smallestNumber(long num) {
        if(num == 0)
            return 0;
        long n = num,ans = 0;
        int count=0,i=0,flag=0;
        while(n!=0){
            count++;
            n/=10;
        }
        long arr[]= new long[count];
        if(num>0){
            n = num;
        }
        else{
            n = -1*num;
        }
        while(n!=0){
            arr[i]=n%10;
            i++;
            n/=10;
        }
        Arrays.sort(arr);
        i= count-1;
        if(num<0){
            for(int j = count -1;j>=0;j--){
                ans = ans*10 +arr[j];
            }
            ans = -1*ans;
        }
        else{
            for(int k = 0;k<count;k++){
                if(arr[k]==0){
                    flag++;
                }
                else{
                    break;
                }
            }
            ans = arr[flag];
            
            for(int l = 0;l<flag;l++){
                ans = ans *10 +arr[l];
            }
            for(int m = flag+1;m<count;m++){
                ans = ans *10 +arr[m];
            }
        }
        return ans;
    }
}
