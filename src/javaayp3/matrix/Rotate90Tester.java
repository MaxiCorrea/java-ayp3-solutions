package javaayp3.matrix;

public class Rotate90Tester {
  
  public static void main(String[] args) {
    
    int[][] sameRowAndColumn = { 
        {1 ,2 , 3 } ,
        {4 ,5 , 6 } ,
        {7 ,8 , 9 } 
    };
    Matrix matrix = new Matrix(sameRowAndColumn);
    matrix.print();
    matrix.rotate90();
    matrix.print();
    
    int[][] differentRowAndColumn = {
        {1 ,2 , 3 } ,
        {4 ,5 , 6 } ,
        {7 ,8 , 9 } ,
        {4 ,3 , 1 }
    };  
    matrix = new Matrix(differentRowAndColumn);
    matrix.print();
    matrix.rotate90();
    matrix.print();
    
  }
  
}
