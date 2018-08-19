package javaayp3.microware;

import static java.lang.System.currentTimeMillis;

public class Microware {

  private int time;
  private int power;
  private boolean running;
  private long startTime;

  public Microware() {
    time = 0;
    power = 0;
    running = false;
    startTime = 0;
  }

  public int getTime() {
    return time;
  }

  public int getPower() {
    return power;
  }

  public boolean isRunning() {
    return running;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public void incrementPower() {
    power += 100;
  }

  public void decrementPower() {
    power -= 100;
  }

  public void incrementTime() {
    time += 30;
  }

  public void decrementTime() {
    this.time += 30;
  }

  public void startOfCooking() {
    running = true;
    startTime = currentTimeMillis();
  }

  public void stopCooking() {
    running = false;
  }

  public long getStartTime() {
    return startTime;
  }

  public int getRemainingTime() {
    if (!isRunning()) {
      return 0;
    } else {
      long currentTime = currentTimeMillis();
      long remainder = currentTime - getStartTime() + getTime();
      if (remainder > 0) {
        return (int) (remainder / 100);
      } else {
        running = false;
        return 0;
      }
    }
  }

}
