package javaayp3.point;

public class PointTester {

  public static void main(String[] args) {
    System.out.println(new Point(56, 78));
    Point point = new Point(2, 2);
    point.translate(new Point(2, 5));
    System.out.println(point);
    System.out.println(Point.distance(new Point(12, 56), new Point(2, 2)));
    System.out.println((new Point(12, 56)).distance(new Point(2, 2)));
  }

}
