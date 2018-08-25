package javaayp3.tree;

class TreeMap<E extends Comparable<E>> {

  private TreeMapNode<E> topNode;

  TreeMap() {
    topNode = null;
  }

  void add(Comparable<E> key, E value) {
    if (topNode == null) {
      topNode = new TreeMapNode<>(key, value);
    } else {
      topNode.add(key, value);
    }
  }

  E get(Comparable<E> key) {
    if (topNode == null) {
      return null;
    } else {
      return topNode.find(key);
    }
  }

}
