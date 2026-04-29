package arrays;

import java.util.Arrays;

public class Concatenate {
//    using inbuilt method
    public void Concat(int[] arr) {
        int[] newArr = arr.clone();
        int[] mergeArr = new int[arr.length + newArr.length];
        System.arraycopy(arr, 0, mergeArr, 0, arr.length);
        System.arraycopy(newArr, 0, mergeArr, arr.length, newArr.length);
        System.out.println(Arrays.toString(mergeArr));
    }
}
