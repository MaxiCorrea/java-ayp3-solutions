package javaayp3.tree;

class TreeMap<K extends Comparable<V>, V> {

  private TreeMapNode<K,V> topNode;

  TreeMap() {
    topNode = null;
  }

  void add(K key, V value) {
    if (topNode == null) {
      topNode = new TreeMapNode<>(key, value);
    } else {
      topNode.add(key, value);
    }
  }

  V get(K key) {
    if (topNode == null) {
      return null;
    } else {
      return topNode.find(key);
    }
  }

}
