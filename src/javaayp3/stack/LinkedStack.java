package javaayp3.stack;

class LinkedStack<E> implements Stack<E> {

  private Node<E> top;

  @Override
  public void push(E element) {
    Node<E> newest = new Node<>();
    newest.element = element;
    newest.next = top;
    top = newest;
  }

  @Override
  public E pop() {
    if (top != null) {
      E removed = top.element;
      top.element = null;
      top = top.next;
      return removed;
    }
    return null;
  }

  @Override
  public E peek() {
    if (top != null) {
      return top.element;
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  private static class Node<E> {
    private E element;
    private Node<E> next;
  }

}
