class Solution {
    public int largestInteger(int num) {
        int arr[] = new int[10];
        int i =9;
        while(num!=0){
            arr[i] = num%10;
            i--;
            num/=10;
        }
        int m = 0;
        while(arr[m]==0){
                    m++;
                }
        for(int j=m;j<9;j++){
            i = j+1;
            if(arr[j]%2 !=0){
                while(i<10){
                    if(arr[j]<arr[i] && arr[i]%2!=0){
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                    i++;
                }
            }
                else{
                    i=j+1;
                while(i<10){
                    if(arr[j]<arr[i] && arr[i]%2==0){
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                    i++;
                }
            }


        }
            
        int ans = 0;
        for(int k = 0;k<10;k++){
            ans = ans*10 +arr[k];
        }
        return ans;
    }
}
