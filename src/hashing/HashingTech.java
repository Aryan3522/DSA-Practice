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
        System.out.println("count: " + count);
    }
//    ===========================================

//    we need a simplified solution for this
//    we can create a hasharray containing 0 value in each index
//    as we know a array starts from index 0 and goes till the number we provide
//    that means a hasharray of size n+1 can be created
//    after creating hash array check array[i] with number if the array index matches the number then increase that number's point in hasharray by 1

    //    hashing for integers
    public void Hashing() {
        int n = 10;
        int[] arr = new int[]{1, 2, 2, 3, 2, 4, 2, 5, 6, 7, 4, 2, 9, 1};
        int[] q = new int[]{2, 5, 4, 9, 0};
        System.out.println("Array: " + Arrays.toString(arr));
//        find greatest number in the array so that we can create a dynamic hash array which can adapt according to the array
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
//        Store in hash arr
        int[] hashArr = new int[max + 1];
        for (int i = 0; i < n; i++) {
            hashArr[arr[i]]++;
        }
        System.out.println("hashArr: " + Arrays.toString(hashArr));
//        fetch the querry numbers
        for (int i = 0; i < q.length; i++) {
            System.out.println("The number " + q[i] + " appears in the array " + hashArr[q[i]] + " times");
        }
    }

    //    character hashing
    public void CharHashing() {
        String[] arr = {
                "a", "b", "c", "d", "e", "f", "g", "h",
                "a", "a", "b", "c", "d", "e", "f", "g",
                "h", "a", "a"
        };

        String[] q = {"a", "c", "b", "d"};

        int[] hashArr = new int[26]; // for small characters -> a-z

        // Store frequency
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i].charAt(0) - 'a';
            hashArr[index]++;
        }

        // Query frequencies
        for (int i = 0; i < q.length; i++) {
            int index = q[i].charAt(0) - 'a';
            System.out.println(q[i] + " -> " + hashArr[index]);
        }
    }

    public void CharHash2() {
        String[] arr = {
                "a", "b", "c", "d", "e", "f", "g", "h",
                "a", "a", "b", "c", "d", "e", "f", "g",
                "h", "a", "a", "A", "B", "C", "D", "E", "F", "G",
        };

        String[] q = {"a", "c", "A", "E", "f", "g", "Z"};

        int[] hashArr = new int[256]; // for all lowercase and uppercase characters
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i].charAt(0);
            hashArr[index]++;
        }
        for (int i = 0; i < q.length; i++) {
            int index = q[i].charAt(0);
            System.out.println(q[i] + " -> " + hashArr[index]);
        }
    }
}
