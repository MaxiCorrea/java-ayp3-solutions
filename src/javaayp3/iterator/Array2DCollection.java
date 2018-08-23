package javaayp3.iterator;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array2DCollection<E> extends AbstractCollection<E> {

  private Object[][] array2d;
  private final int rows;
  private final int cols;

  public Array2DCollection(int rows, int cols) {
    array2d = new Object[rows][cols];
    this.rows = rows;
    this.cols = cols;
  }
  
  @Override
  public Iterator<E> iterator() {
    return new IteratorArray2d();
  }

  @SuppressWarnings("unchecked")
  public E get(int row, int col) {
    return (E) array2d[row][col];
  }


  @Override
  public int size() {
    return rows * cols;
  }

  private class IteratorArray2d implements Iterator<E> {

    private int currentRow = 0;
    private int currentCol = 0;

    @Override
    public boolean hasNext() {
      return !(currentRow == rows - 1 && currentCol == cols - 1);
    }

    @Override
    public E next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      E obj = get(currentRow, currentCol);
      if (currentCol < cols - 1) {
        ++currentCol;
      } else {
        currentCol = 0;
        ++currentRow;
      }
      return obj;
    }

  }

}
