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

//    Butterfly Pattern
    public int Butterfly(int n) {
        int spaces = 2*n-2;
        int stars = 0;
        for(int i = 1; i<=2*n-1; i++){
            if(i<=n){
                stars = i;
            }else if(i>n){
                stars = 2*n-i;
            }

            for(int j = 0; j<stars; j++){
                System.out.print("*");
            }
            for(int j = 0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<stars; j++){
                System.out.print("*");
            }
            if(i<n){
                spaces -= 2;
            }else{
                spaces += 2;
            }
            System.out.println();
        }
        return -1;
    }
}
