package javaayp3.fraction;

public class FractionTester {

  public static void main(String[] args) {
    System.out.println(Fraction.of(4, 5).add(Fraction.of(1, 3)));
    System.out.println(Fraction.of(4, 5).subtract(Fraction.of(1, 3)));
    System.out.println(Fraction.of(4, 5).multiply(Fraction.of(1, 3)));
    System.out.println(Fraction.of(4, 5).equals(Fraction.of(1, 3)));
    System.out.println(Fraction.of(4, 5).equals(Fraction.of(4, 5)));
    System.out.println(Fraction.of(4, 5).pow(3));
  }

}
