package javaayp3.clock;

class SetMinutes implements State {

  @Override
  public void pressButtonA(Clock clock) {
    clock.setState(new Showing());
  }

  @Override
  public void pressButtonB(Clock clock) {
    int currentMinutes = clock.getMinutes();
    clock.setMinutes(currentMinutes + 1);
  }

}
