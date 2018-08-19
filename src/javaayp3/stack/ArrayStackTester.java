package javaayp3.stack;

public class ArrayStackTester {

  public static void main(String[] args) {
    Stack<String> stack = new ArrayStack<>(5);
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    stack.push("E");
    while(!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
  
}
