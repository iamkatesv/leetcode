package leetcode.stock;

public class Stock {

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {
    int min = prices[0];
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      profit = Math.max(profit, prices[i] - min);
    }

    return profit;
  }

}
