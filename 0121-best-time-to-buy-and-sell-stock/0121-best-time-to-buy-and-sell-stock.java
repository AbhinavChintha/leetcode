class Solution {
    public int maxProfit(int[] prices) {
        int profit,min=prices[0],max=Integer.MIN_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            max=Math.max(max,profit);
            
        }
        return max;
    }
}