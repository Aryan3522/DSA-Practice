package PrintN;

public class Nnumbers {
    //    forward recursion
    public void printNumbers(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.print(count + " ");
        printNumbers(n, count + 1);
    }

    //    backtracking
    public void printNumbers1(int n, int count) {
        if (count > n) {
            return;
        }
        printNumbers1(n, count + 1);
        System.out.print(count + " ");
    }
}
