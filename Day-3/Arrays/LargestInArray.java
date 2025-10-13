import java.util.*;

public class LargestInArray {

    public static void main(String[] args) {
        int arr[] = { 0, 2, 45, 3, 66, 44 };

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }

}
