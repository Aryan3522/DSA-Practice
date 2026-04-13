package CountDigits;

public class NumberFactorial {
    public int Factorial(int n) {
        int fact = 1;
        for(int i=n; i>=1; i--) {
            fact *= i;
            System.out.println(fact);
        }
        return -1;
    }
}
