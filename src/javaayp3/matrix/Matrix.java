package javaayp3.matrix;

public class Matrix {

  private int[][] data;

  Matrix(int[][] data) {
    this.data = data;
  }

  void rotate90() {
    final int ROWS = data.length;
    final int COLS = data[0].length;
    int[][] tmp = new int[COLS][ROWS];
    for (int row = 0; row < COLS; ++row) {
      for (int col = 0; col < ROWS; ++col) {
        tmp[row][col] = data[col][COLS - 1 - row];
      }
    }
    data = tmp;
  }

  void rotate180() {
    final int ROWS = data.length;
    final int COLS = data[0].length;
    int[][] tmp = new int[ROWS][COLS];
    for( int row = 0; row < ROWS ; ++row) {
      for( int col = 0 ; col < COLS ; ++col) {
        tmp[ROWS - 1 - row][COLS - 1 - col] = data[row][col];
      }
    }
    data = tmp;
  }

  void print() {
    System.out.println();
    for (int row = 0; row < data.length; ++row) {
      for (int col = 0; col < data[row].length; ++col) {
        System.out.print(" " + data[row][col]);
      }
      System.out.println();
    }
  }

}
