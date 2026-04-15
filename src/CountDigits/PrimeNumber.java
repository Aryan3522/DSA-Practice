package CountDigits;

public class PrimeNumber {

    public boolean isPrime(int n) {

        if (n <= 1) {
            System.out.println(n + " is Not prime");
            return false;
        }

        if (n == 2) {
            System.out.println(n + " is a Prime Number");
            return true;
        }

        if (n % 2 == 0) {
            System.out.println(n + " is Not prime");
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println(n + " is Not prime");
                return false;
            }
        }

        System.out.println(n + " is a Prime Number");
        return true;
    }
}