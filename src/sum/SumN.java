package sum;

public class SumN {
    //    brute force
//    using a for loop
    public void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of first " + n + " numbers: " + sum);
    }

    //    using formula
    public int sum1(int n) {
        System.out.println(n * (n + 1) / 2);
        return n * (n + 1) / 2;
    }

    //    using recursion
    public int sum2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum2(n - 1);
    }
}
