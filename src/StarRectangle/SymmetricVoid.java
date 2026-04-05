package StarRectangle;

public class SymmetricVoid {
    int iniS = 0;
    //        upper Half
    public int Symmetric_Void(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            iniS += 2;
        }

//        lower half
        iniS = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            iniS -= 2;
        }
        return -1;
    }
}
