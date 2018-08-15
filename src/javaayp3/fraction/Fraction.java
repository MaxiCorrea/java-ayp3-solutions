package javaayp3.fraction;

import static javaayp3.util.Math.*;

public final class Fraction {

  public static Fraction of(int numerator, int denominator) {
    if (denominator == 0) {
      throw new FractionException("Denominador igual a cero.");
    }
    return new Fraction(numerator, denominator);
  }

  private final int numerator;
  private final int denominator;

  private Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction add(Fraction another) {
    int denominator = mcm(this.numerator, another.denominator);
    int numerator = denominator / this.denominator * this.numerator
        + denominator / another.denominator * another.numerator;
    return simplify(new Fraction(numerator, denominator));
  }

  public Fraction subtract(Fraction another) {
    int denominator = mcm(this.numerator, another.denominator);
    int numerator = denominator / this.denominator * this.numerator
        - denominator / another.denominator * another.numerator;
    return simplify(new Fraction(numerator, denominator));
  }

  public Fraction multiply(Fraction another) {
    int numerator = this.numerator * another.numerator;
    int denominator = this.denominator * another.denominator;
    return simplify(new Fraction(numerator, denominator));
  }

  public Fraction pow(int exponent) {
    int numerador = javaayp3.util.Math.pow(this.numerator, exponent);
    int denominator = javaayp3.util.Math.pow(this.denominator, exponent);
    return simplify(new Fraction(numerador, denominator));
  }

  private Fraction simplify(Fraction another) {
    int divisor = mcd(numerator, denominator);
    int numerator = another.numerator / divisor;
    int denominator = another.denominator / divisor;
    return new Fraction(numerator, denominator);
  }

  public double toDouble() {
    return Double.valueOf(numerator / denominator);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + denominator;
    result = prime * result + numerator;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    final Fraction other = (Fraction) obj;
    return this.numerator == other.numerator &&
           this.denominator == other.denominator;
  }

  @Override
  public String toString() {
    String format = "Fraction [numerator: %d , denominator: %d]";
    return String.format(format, this.numerator, this.denominator);
  }

}
