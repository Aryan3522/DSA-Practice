package StarRectangle;

public class Square {
    public int square(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return -1;
    }

    public int HollowSquare(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return -1;
    }

    public int Matrix(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = (2*n-2) - i;
                int bottom = j;
                int right = (2*n-2) - j;
                // Take the minimum of all four distances
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }

        return -1;
    }
}
