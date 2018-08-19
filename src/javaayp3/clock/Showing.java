package javaayp3.clock;

class Showing implements State {

  @Override
  public void pressButtonA(Clock clock) {
    clock.setState(new SetHours());
  }

  @Override
  public void pressButtonB(Clock clock) {}

}
