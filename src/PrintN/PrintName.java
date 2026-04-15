package PrintN;

public class PrintName {
    //    decrease n itself until it becomes 1 (greater than 0)
    public void name(int n) {
        if (n == 0) {
            return;
        }
        if (n > 0) {
            System.out.println("Aryan ");
            n--;
            name(n);
        }
    }

    //    increase count until count is equal to n
    public void name1(String name, int count, int n) {
        if (count == n) {
            return;
        } else {
            System.out.println(name + " ");
            name1(name, count + 1, n);
        }
    }
}
