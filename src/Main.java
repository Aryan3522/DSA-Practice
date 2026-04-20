import CountDigits.ArmStrong;
import CountDigits.DigitsInNumber;
import CountDigits.PrintDivisors;
import PrintN.Nnumbers;
import PrintN.PrintName;
import StarRectangle.Square;
import StarRectangle.SymmetricVoid;
import StarTriangle.Triangle;
import arrays.Reverse;
import arrays.Shuffle;
import fibonacci.FibonacciSeries;
import hashing.HashingTech;
import strings.Palindrome;
import sum.Factorial;
import sum.SumN;

void main() {
    Square sq = new Square();
    sq.square(5);
//    print a hollow square
    sq.HollowSquare(5);

//    print number matrix
    sq.Matrix(5);

    Triangle t = new Triangle();
//    form a right-angled triangle
    t.triange(5);
//    form a reverse right-angled triangle
    t.revTriangle(5);
//    triangle symmetry
    t.triangle2(5);
//    form a num triangle
    t.NumTriangle(5);
//    num triangle 2
    t.NumTriangle2(5);
//    reverse num triangle
    t.revNumTriangle(5);
//    reverse num triangle 2
    t.revNumTriangle2(5);
//    reverse num triangle 3
    t.revNumTriangle3(5);
//    form a pyramid
    t.pyramid(5);
//    form reverse pyramid
    t.revPyramid(5);
//    form diamond
    t.diamond(5);
//    form binary number triangle
    t.BinaryNumTriangle(5);
//    form num crown
    t.NumCrown(3);
//    form increasing number triangle
    t.increaseNumTriangle(5);
//    form letter triangle
    t.letterTriangle(5);
//    form reverse letter triangle
    t.revLetterTriangle(5);
//    letter triangle 2
    t.letterTriangle2(5);
//    letter pyramid
    t.letterPyramid(5);
//    form alpha Triangle
    t.AlphaTriangle(5);

//    Form a Symmetric void rectangle
    SymmetricVoid sym = new SymmetricVoid();
//    print a void rectangle
    sym.Symmetric_Void(5);

//    print a butterfly
    sym.Butterfly(5);

//    Count Digits
    DigitsInNumber c = new DigitsInNumber();
    c.BruteForce(3522);

//    optimal approach
//    use Math.log10 to count digits in the given int
//    also typecast the Math.log10 to int (it takes double by default)
    c.Optimal(12345678);

//    reverse number
    c.reverse(12345);

    c.Palindrome(1234);
    c.Palindrome(121);

//    find gcd
    c.findGCD(15, 20);
    c.findGCD(36, 36);

//    is ArmStrong
    ArmStrong ar = new ArmStrong();
    ar.isArmStrong(153);

//    Print Divisors
    PrintDivisors pd = new PrintDivisors();
//    pd.Divisors(5);
    pd.Divisors(36);

//    Print name n times recursion
    PrintName pn = new PrintName();
    pn.name(5);
    pn.name1("Aryan Hooda", 0, 2);

//    Print n numbers using recursion
//    count should 1
    Nnumbers nm = new Nnumbers();
    nm.printNumbers(5, 1);
    nm.printNumbers1(5, 1);
    System.out.println();

//    Sum of n numbers
    SumN s = new SumN();
//    using brute force
    s.sum(5);
//    using formula
    s.sum1(5);
//    using recursion
    System.out.println("recursive approach: " + s.sum2(5));
    Factorial f = new Factorial();
    f.FindFactorial(5);
    System.out.println(f.FindFactorial2(5));

//    reverse array
    int[] myArr = new int[]{1, 2, 3, 4, 5};
    Reverse r = new Reverse(myArr);
    System.out.println(r);

//    check if the string is a palindrome or not
    Palindrome p = new Palindrome();
    p.isPalindrome("121");
    p.isPalindrome("ABCDCBA");

//    fibonacci series
    FibonacciSeries fs = new FibonacciSeries();
    fs.fibonacci(7);
    System.out.println();
//    hashing
    HashingTech h = new HashingTech();
    h.findNumOccurrences(new int[]{1, 2, 4, 3, 1}, 4);
    h.Hashing();
    h.CharHashing();
    System.out.println("---------------------------");
    h.CharHash2();

//    shuffle array
    Shuffle sf = new Shuffle();
    sf.shuffle(new int[]{1, 2, 5, 4, 3, 6}, 3);
}
