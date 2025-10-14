public class MaximumSubarrayBrute {

    public static void printMaxSubarray(int arr[]) {

        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                CurrSum = 0;
                for (int k = start; k < end; k++) {
                    CurrSum += arr[k];
                }
                if (CurrSum > MaxSum) {
                    MaxSum = CurrSum;
                }

            }

        }
        System.out.println("The Max sum of subarray is: " + MaxSum);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        printMaxSubarray(arr);
    }
}
