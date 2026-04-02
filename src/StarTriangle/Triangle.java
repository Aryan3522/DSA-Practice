package StarTriangle;

public class Triangle {
    public int triange(int n){
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return -1;
    }
    public int revTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return -1;
    }
    public int NumTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        return -1;
    }
    public int NumTriangle2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        return -1;
    }
    public int revNumTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print((n - j + 1));
            }
            System.out.println();
        }
        return -1;
    }
    public int revNumTriangle2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        return -1;
    }
    public int revNumTriangle3(int n){
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println();
        }
        return -1;
    }
}
