package CountDigits;

public class ArmStrong {
    public int isArmStrong(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int digit = str.charAt(i) - '0';
            int value = str.charAt(i);
            System.out.println("value: " + value);
            System.out.println("str.charAt(i): " + str.charAt(i));
            System.out.println("digit: " + digit);
            int result = (int) Math.pow(digit, length);
            sum += result;
        }

        if (sum == n) {
            System.out.println("Arm Strong");
            return 1;
        } else {
            System.out.println("Not Arm Strong");
            return -1;
        }
    }
}
