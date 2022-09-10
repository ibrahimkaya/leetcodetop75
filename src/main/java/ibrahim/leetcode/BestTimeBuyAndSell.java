package ibrahim.leetcode;

/**
 * @Author ibrahim
 * @create 10.09.2022 11:31
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">...</a>
 */
public class BestTimeBuyAndSell {

    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int minPrice = prices[0];
        int currentProfit = 0;
        int currentPrice;
        for (int price : prices) {
            currentPrice = price;
            currentProfit = Math.max(currentProfit, currentPrice - minPrice);
            minPrice = Math.min(currentPrice, minPrice);
        }

        return currentProfit;
    }
}
