// Time complexity: O(n)
// space complexity: O(1)
//One transaction
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
       int profitsofar = 0;
        
        for(int i=1;i<prices.length;i++){
            maxprofit = maxprofit + prices[i]-prices[i-1];
            if(maxprofit<0){
                maxprofit = 0;
            }
            if(maxprofit>profitsofar){
                profitsofar=maxprofit;
            }
        }
        return profitsofar;
    }
}



//multiple transactions
// Time complexity: O(n)
// space complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                profit = profit +prices[i]-prices[i-1];
        }
        return profit;
        
    }
}