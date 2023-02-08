import junit.framework.TestCase;

public class BestTimeToBuyAndSellStockTest extends TestCase {
    public void testProfit(){
        int[] prices = {7, 1, 3, 4, 9, 5, 2, 8};
        int actualPrices = Main.Solution.maxProfit(prices);
        int expectedPrices = 14;
        assertEquals(expectedPrices, actualPrices);

    }

    public void testZeroProfit(){
        int[] prices = {7, 6, 4, 3, 1};
        int actualPrices = Main.Solution.maxProfit(prices);
        int expectedPrices = 0;
        assertEquals(expectedPrices, actualPrices);
    }

}