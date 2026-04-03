package StarTriangle;

public class Triangle {
    public int triange(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return -1;
    }

    public int revTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return -1;
    }

    public int triangle2(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return -1;
    }

    public int NumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return -1;
    }

    public int NumTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        return -1;
    }

    public int revNumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((n - j + 1));
            }
            System.out.println();
        }
        return -1;
    }

    public int revNumTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        return -1;
    }

    public int revNumTriangle3(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        return -1;
    }

    public int pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        return -1;
    }

    public int revPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        return -1;
    }

    public int diamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        return -1;
    }

    public int BinaryNumTriangle(int n) {
        int start;
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        return -1;
    }

    public int NumCrown(int n) {
        int spaces = 2*(n-1);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
        return -1;
    }

    public int increaseNumTriangle(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
        return -1;
    }

    public String letterTriangle(int n) {
        for (int i = 0; i < n; i++) {

            // Inner loop to print alphabets from A to A + i
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
        return "null";
    }

    public String revLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        return "null";
    }

    public String letterTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        return "null";
    }
}
