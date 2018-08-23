package javaayp3.vectors;

public class VectorsTester {

  public static void main(String[] args) {
     test( new SortVectors());
     test( new ScalarVectors(2));
  }
  
  private static void test(Vectors vectors) {
    vectors.process();
    System.out.println(vectors);
  }
  
}
