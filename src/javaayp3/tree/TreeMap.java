package javaayp3.tree;

@SuppressWarnings({"rawtypes", "unchecked"})
class TreeMap<E> {

  private TreeMapNode<E> topNode;

  TreeMap() {
    topNode = null;
  }

  void add(Comparable<Object> key, E value) {
    if (topNode == null) {
      topNode = new TreeMapNode(key, value);
    } else {
      topNode.add(key, value);
    }
  }

  Object get(Comparable<Object> key) {
    if (topNode == null) {
      return null;
    } else {
      return topNode.find(key);
    }
  }

}
