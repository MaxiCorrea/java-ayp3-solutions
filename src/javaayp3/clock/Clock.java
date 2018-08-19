package javaayp3.clock;

public class Clock {

  private int hours;
  private int minutes;
  private State state;

  public Clock() {
    this.hours = 0;
    this.minutes = 0;
    state = new Showing();
  }

  public void pressButtonA() {
    state.pressButtonA(this);
  }

  public void pressButtonB() {
    state.pressButtonB(this);
  }

  void setState(State state) {
    this.state = state;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getHours() {
    return hours;
  }

  public int getMinutes() {
    return minutes;
  }

  @Override
  public String toString() {
    return String.format("Time %d : %d", getHours(), getMinutes());
  }

}
