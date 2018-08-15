package javaayp3.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

  public static double distance(Point p1, Point p2) {
    return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
  }

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void translate(Point delta) {
    this.x += delta.x;
    this.y += delta.y;
  }

  public double distance(Point another) {
    return distance(this, another);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Point other = (Point) obj;
    return this.x == other.x && this.y == other.y;
  }

  @Override
  public String toString() {
    String format = "Point[x:%d , y:%d]";
    return String.format(format, this.x, this.y);
  }

}
