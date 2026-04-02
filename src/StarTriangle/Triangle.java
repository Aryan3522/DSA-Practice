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
}
