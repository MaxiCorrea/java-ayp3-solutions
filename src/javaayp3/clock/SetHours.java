package javaayp3.clock;

class SetHours implements State {

  @Override
  public void pressButtonA(Clock clock) {
    clock.setState(new SetMinutes());
  }

  @Override
  public void pressButtonB(Clock clock) {
    int currentHours = clock.getHours();
    clock.setHours(currentHours + 1);
  }

}
