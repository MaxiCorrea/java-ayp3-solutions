package javaayp3.stack;

class ArrayStack<E> implements Stack<E> {

  private int topIndex;
  private Object[] elements;

  public ArrayStack(int capacity) {
    elements = new Object[capacity];
  }

  @Override
  public void push(E element) {
    if (topIndex < elements.length) {
      elements[topIndex++] = element;
    }
  }

  @Override
  public E pop() {
    if (topIndex >= 0) {
      @SuppressWarnings("unchecked")
      E element = (E) elements[topIndex - 1];
      elements[--topIndex] = null;
      return element;
    }
    return null;
  }

  @Override
  public E peek() {
    if (topIndex >= 0) { 
      @SuppressWarnings("unchecked")
      E element = (E) elements[topIndex - 1];
      return element;
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return topIndex == 0;
  }

}
