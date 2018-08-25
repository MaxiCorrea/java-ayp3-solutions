package javaayp3.tree;

@SuppressWarnings({"rawtypes", "unchecked"})
class TreeMapNode<E> {

  private static final int LESS = 0;
  private static final int GREATER = 1;

  private Comparable<E> itsKey;
  private E itsValue;
  private TreeMapNode[] nodes;

  TreeMapNode(Comparable<E> key, E value) {
    itsKey = key;
    itsValue = value;
    nodes = new TreeMapNode[2];
  }

  void add(Comparable<Object> key, E value) {
    if (key.compareTo(itsKey) == 0) {
      itsValue = value;
    } else {
      addSubNode(selectSubNode(key), key, value);
    }
  }

  private void addSubNode(int node, Comparable<Object> key, E value) {
    if (nodes[node] == null) {
      nodes[node] = new TreeMapNode(key, value);
    } else {
      nodes[node].add(key, value);
    }
  }

  Object find(Comparable<Object> key) {
    if (key.compareTo(itsKey) == 0) {
      return itsValue;
    } else {
      return findSubNodeForKey(selectSubNode(key), key);
    }
  }

  private Object findSubNodeForKey(int node, Comparable<Object> key) {
    if (nodes[node] == null) {
      return null;
    } else {
      return nodes[node].find(key);
    }
  }

  private int selectSubNode(Comparable<Object> key) {
    return key.compareTo(itsKey) < 0 ? LESS : GREATER;
  }

}
