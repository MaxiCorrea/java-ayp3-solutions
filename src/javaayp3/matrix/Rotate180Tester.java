package javaayp3.matrix;

public class Rotate180Tester {

  public static void main(String[] args) {
    
    int[][] sameRowAndColumn = { 
        {1 ,2 , 3 } ,
        {4 ,5 , 6 } ,
        {7 ,8 , 9 } 
    };
    
    Matrix matrix = new Matrix(sameRowAndColumn);
    matrix.print();
    matrix.rotate180();
    matrix.print();
  }
  
}
