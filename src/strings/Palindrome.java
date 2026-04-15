package strings;

public class Palindrome {
    public void isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palindrome");
    }
}
