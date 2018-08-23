package javaayp3.vectors;

import java.util.Arrays;

public class SortVectors extends Vectors {

  @Override
  void toElaborate() {
    Arrays.sort(getArray());
  }

}
