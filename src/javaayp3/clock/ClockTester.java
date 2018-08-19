package javaayp3.clock;

public class ClockTester {

  public static void main(String[] args) {
    Clock clock = new Clock();
    System.out.println(clock);
    clock.pressButtonA();
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonA();
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonB();
    System.out.println(clock);
    clock.pressButtonA();
    System.out.println(clock);
  }
  
}
