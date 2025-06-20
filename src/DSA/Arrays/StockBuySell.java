package DSA.Arrays;/*
Stock Buy and Sell – Max one Transaction Allowed

Given an array prices[] of length N, representing the prices of the stocks on different days,
the task is to find the maximum profit possible by buying and selling the stocks on different
days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
Output: 8
Explanation: Buy for price 1 and sell for price 9.


Input: prices[] = {7, 6, 4, 3, 1}
Output: 0
Explanation: Since the array is sorted in decreasing order, 0 profit can be made without
making any transaction.

Input: prices[] = {1, 3, 6, 9, 11}
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by
buying at price[0] and selling at price[n-1]
 */


/*[Naive Approach] By exploring all possible pairs – O(n^2) Time and O(1) Space
The idea is to use two nested loops to explore all the possible ways to buy and sell stock.
The outer loop decides the day to buy the stock and the inner loop decides the day to sell the stock.
The maximum difference between the selling
price and buying price between every pair of days will be our answer.
package DSA.Arrays;*/

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices={7, 10, 1, 3, 6, 9, 2};
       int ans= maxProfit(prices);
       System.out.println(ans);

    }

//        int n=prices.length;
//        int res=0;
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                res=Math.max(res,prices[j]-prices[i]);
//            }
//        }
    static int maxProfit(int[] prices){
        int minSoFar=prices[0];
        int res=0;
        int n= prices.length;
        for(int i=1;i<n;i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

}
