package hashing;

// let's say array is [1,2,3,2,3,4,1]
// let's say querry is [1,3,4,2]
// that means we need a hash array from 0-4 that means 5 numbers
// hash array: [0,0,0,0,0] put 0 initially in it
// now take the querry number, go to array and check if the number is present in the array or not
// if present go to hasharray[q[i]] and add 1 in it.
// here q[i] is qurry index, let's say we took 1 from querry
// checking with array 1 is present twice
// during for loop checking add 1 in hasharray[q[i]] the number of times q[i] matches in the array

import java.util.Arrays;

public class HashingTech {
//    without hashing
//    this method takes O(Q*N) time to execute which is very large if both q and n arrays are of big sizes
    public void findNumOccurrences(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = count + 1;
            }
        }
        System.out.println("count: "+count);
    }
//    ===========================================

//    we need a simplified solution for this
//    we can create a hasharray containing 0 value in each index
//    as we know a array starts from index 0 and goes till the number we provide
//    that means a hasharray of size n+1 can be created
//    after creating hash array check array[i] with number if the array index matches the number then increase that number's point in hasharray by 1

    public void Hashing(){
        int[] arr = new int[]{1,2,4,6,2,3,1};
        int n = 12;
        int[] q = new int[]{1,4,6,5};
        int[] hash = new int[n+1];
//        a new array of a specific size always take 0 as default for all the index numbers
//        initializing part
        for(int i = 0; i<arr.length;i++){
            hash[arr[i]]++;
        }
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i] + " occurs " + hash[q[i]] + " times");
        }
    }
}
