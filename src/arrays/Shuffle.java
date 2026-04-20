package arrays;

import java.util.Arrays;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] firstHalf = Arrays.copyOfRange(nums, 0, n);
        int[] secondHalf = Arrays.copyOfRange(nums, n, nums.length);
        int[] temparr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            temparr[count] = firstHalf[i];
            temparr[count + 1] = secondHalf[i];
            count += 2;
        }
        System.out.println(Arrays.toString(temparr));
        return temparr;
    }
}
