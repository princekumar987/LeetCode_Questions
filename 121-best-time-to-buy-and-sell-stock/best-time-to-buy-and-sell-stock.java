class Solution {
    public int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]>min){
                ans=Math.max(ans,prices[i]-min);
            }
            min=Math.min(prices[i],min);

        }

        return ans;
    }
}