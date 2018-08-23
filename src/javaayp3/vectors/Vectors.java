package javaayp3.vectors;

import java.util.Arrays;

abstract class Vectors {

  private final int CAPACITY = 10;
  private final int[] array;

  Vectors() {
    array = new int[CAPACITY];
  }

  int[] getArray() {
    return array;
  }
  
  void process() {
    loadArray();
    toElaborate();
  }

  private void loadArray() {
    for (int x = 0; x < array.length; ++x) {
      int randInt = (int) (Math.random() * 100);
      array[x] = randInt;
    }
  }

  abstract void toElaborate();

  @Override
  public String toString() {
    return "Vectors [array=" + Arrays.toString(array) + "]";
  }

}
