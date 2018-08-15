package javaayp3.util;

import static java.lang.Math.max;
import static java.lang.Math.min;

public final class Math {

  private Math() {
    throw new AssertionError("Clase de utilidad tontito/a ;)");
  }

  public static int mcd(int num1, int num2) {
    while (num2 != 0) {
      int tmp = num2;
      num2 = num1 % num2;
      num1 = tmp;
    }
    return num1;
  }

  public static int mcm(int num1, int num2) {
    int mcm = 0;
    int a = max(num1, num2);
    int b = min(num1, num2);
    mcm = (a / mcd(a, b)) * b;
    return mcm;
  }

  public static int pow(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      int sum = 0;
      for (int i = 0; i < exponent; i++) {
        sum += base;
      }
      return sum;
    }
  }

}
