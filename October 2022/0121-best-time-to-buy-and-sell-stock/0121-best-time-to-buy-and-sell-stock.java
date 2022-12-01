class Solution {
    public int maxProfit(int[] prices) {
        int[] Aux = new int[prices.length];
        Aux[prices.length-1]=prices[prices.length-1];
        int max=Aux[prices.length-1];
        int maxp;
        for(int i = prices.length-2;i>=0;i--){
            if(prices[i]>Aux[i+1]){
                Aux[i]=prices[i];
                max=prices[i];
            }
            else{
                Aux[i]=max;
            }
        }
        maxp=Aux[0]-prices[0];
        int k;
        for(int j=1;j<prices.length;j++){
            k=Aux[j]-prices[j];
            if(maxp<k){
                maxp=Aux[j]-prices[j];
            }
        }
        return maxp;
        
    }
}