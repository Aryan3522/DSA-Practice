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
}
