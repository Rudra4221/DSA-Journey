
public class BuyAndSell {

    public static void buyAndSell(int arr[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {

            if (buyPrice > arr[i]) {
                buyPrice = arr[i];
            }

            int profit = arr[i] - buyPrice;

            maxProfit = Math.max(profit, maxProfit);
        }
        System.out.println(maxProfit);

    }

    public static void main(String[] args) {

        int arr[] = { 7, 1, 5, 3, 6, 4 };

        buyAndSell(arr);
    }
}
