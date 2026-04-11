package CountDigits;

import java.util.*;

import java.util.ArrayList;

public class PrintDivisors {
    public int Divisors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != n / i) {
                    res.add(n / i);
                }
            }
        }
//        Print Unsorted ArrayList
        System.out.println(res);
//        Sort ArrayList
        Collections.sort(res);
//        Print Sorted ArrayList
        System.out.println(res);
        return -1;
    }
}
