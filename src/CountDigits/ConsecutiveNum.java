package CountDigits;

public class ConsecutiveNum {
    public void maxConsecutive(int[] arr) {
        int currentcount = 0;
        int mx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentcount++;
                if (currentcount > mx) {
                    mx = currentcount;
                }
            } else {
                currentcount = 0;
            }
        }
        System.out.println("max consecutives: " + mx);
    }
}
