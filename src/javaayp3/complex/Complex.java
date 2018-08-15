package javaayp3.complex;

import static java.lang.Double.compare;
import static java.lang.Double.doubleToLongBits;
import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;

public final class Complex {

  public static Complex of(double real) {
    return new Complex(real, 0.0);
  }

  public static Complex of(double real, double imaginary) {
    return new Complex(real, imaginary);
  }

  private final double real;
  private final double imag;

  private Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double module() {
    return sqrt(real * real + imag * imag);
  }
  
  public double argument() {
    return atan2(imag, real);
  }

  public Complex add(Complex another) {
    double real = this.real + another.real;
    double imag = this.imag + another.imag;
    return new Complex(real, imag);
  }

  public Complex subtract(Complex another) {
    double real = this.real - another.real;
    double imag = this.imag - another.imag;
    return new Complex(real, imag);
  }
  
  public Complex multiply(Complex another) {
    double real = this.real * another.real - this.imag * another.imag;
    double imag = this.real * another.imag + this.imag * another.real;
    return new Complex(real, imag);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = doubleToLongBits(imag);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = doubleToLongBits(real);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Complex other = (Complex) obj;
    return compare(this.real, other.real) == 0 &&
           compare(this.imag, other.imag) == 0;
  }
  
  @Override
  public String toString() {
    String format = "Complex[real:%g , imaginary:%g]";
    return String.format(format, this.real , this.imag);
  }
  
}


