package sum;

public class Factorial {
    //    iterative approach
    public void FindFactorial(int n) {
        int fact = n;
        for (int i = 1; i < n; i++) {
            fact = fact * (n - i);
        }
        System.out.println(fact);
    }

    //    recursive approach
//    if using recursive approach you must return the value and print it when calling/running the code in main file
    public int FindFactorial2(int n) {
        if (n == 0) {
            return 1;
        }
        return n * FindFactorial2(n - 1);
    }
}
