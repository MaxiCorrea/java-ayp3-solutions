package javaayp3.complex;

public class ComplexTester {

  public static void main(String[] args) {
    System.out.println(Complex.of(45));
    System.out.println(Complex.of(45, 6));
    System.out.println(Complex.of(45, 6).module());
    System.out.println(Complex.of(45, 6).argument());
    System.out.println(Complex.of(45, 6).add(Complex.of(4, 5)));
    System.out.println(Complex.of(45, 6).subtract(Complex.of(4, 5)));
    System.out.println(Complex.of(45, 6).multiply(Complex.of(4, 5)));
  }

}
