/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */

public class BestTimeSellStocks {
    /*
    We need to find out the maximum difference (which will be the maximum profit) between
    two numbers in the given array. Also, the second number (selling price) must be
    larger than the first one (buying price).

    In formal terms, we need to find max({prices[j]} - {prices[i]})
    , for every i and j such that j > i
    take 2 for loops and iterate through the array , subtract adjacent value in the array to find the profit
    and for each subtraction find the max value and assign that to maxprofit..

    below is brute force solution with O(n)^2
     */
    public int maxProfitBF(int prices[]){
        int maxprofit=0;
        for(int i=0; i < prices.length-1;i++){
            for( int j=i+1;j < prices.length;j++){
                int profit= prices[j]-prices[i];
                if(profit>maxprofit){
                    profit=maxprofit;
                }
            }

        }
        return maxprofit;
    }

    /*
    One pass solution for O(n)
     */

}
