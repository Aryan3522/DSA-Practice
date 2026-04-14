package arrays;

import java.util.Arrays;

public class Reverse {
    int[] arr;

    public Reverse(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(reverseArray(arr));
    }

    public int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[n - 1 - i];
        }
        return res;
    }
}
