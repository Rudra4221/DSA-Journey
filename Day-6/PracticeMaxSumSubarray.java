
public class PracticeMaxSumSubarray {

    public static void printMaxSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6 };

        printMaxSum(arr);
    }
}
