package CountDigits;

public class DigitsInNumber {
    public int BruteForce(int n){
//        Brute Force
        int count = 0;
        while(n>0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
        return count;
    }

    public int Optimal(int n){

        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);

        return count;
    }

//    reverse a number
    public int reverse(int n){
        int newNumber = 0;
        while (n > 0){
            newNumber = newNumber * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Number is: " + newNumber);
        return newNumber;
    }

//    palindrome
    public boolean Palindrome(int n){
        int revNumber = reverse(n);
        if(revNumber == n){
            System.out.println("Palindrome");
            return true;
        }
        System.out.println("Not Palindrome");
        return false;
    }

    public String isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not Palindrome");
                return "Not Palindrome";
            }
        }
        System.out.println("Palindrome");
        return "Palindrome";
    }

//    find gcd
    public int findGCD(int n1, int n2){
        System.out.println("Numbers are: " + n1 + " " + n2);

        for(int i = Math.min(n1,n2); i > 0; i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                return i;
            }
        }
        return 1;
    }
}
