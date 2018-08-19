package javaayp3.stack;

interface Stack<E> {

  void push(E element);
  
  E pop();
  
  E peek();
  
  boolean isEmpty();
    
}
