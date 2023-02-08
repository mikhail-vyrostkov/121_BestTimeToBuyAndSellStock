import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        int[] prices = {7, 5, 1, 3, 6, 4};
        int[] prices1 = {2, 4, 1};
        System.out.println(Solution.maxProfit(prices));
    }

    public static class Solution {

        public static int maxProfit(int[] prices) {
            int buy = prices[0], max_profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (buy > prices[i]) {
                    buy = prices[i];
                } else if (prices[i] - buy > max_profit)
                    max_profit = prices[i] - buy;
            }
            return max_profit;
        }
    }
}