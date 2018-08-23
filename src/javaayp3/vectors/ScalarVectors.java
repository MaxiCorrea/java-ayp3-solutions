package javaayp3.vectors;

class ScalarVectors extends Vectors {

  private int number;
  
  public ScalarVectors( int number) {
    this.number = number;
  }

  @Override
  void toElaborate() {
    int [] array = getArray();
    for( int x = 0 ; x < array.length ; ++x) {
      array[x] *= number;
    }
  }
  
}
