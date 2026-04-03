import StarRectangle.Square;
import StarTriangle.Triangle;

void main() {
    Square sq = new Square();
    sq.square(5);

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
}
