package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    int[] arr;

    public Reverse(int[] arr) {
        this.arr = arr;
    }

    //    brute force
//    take last digit of the original and push it to the first index of the new arr
    public void reverseArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[n - 1 - i];
        }

        System.out.println(Arrays.toString(res));
    }

    // optimal print method
    public void reverseArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    //    using built-in method
    public void reverseArray3(List<Integer> arr) {
        Collections.reverse(Arrays.asList(arr));
    }
}
