package oop.workspace.customTypeData;

public class customMap<K, V>{
    class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.key = key;
            this.value = value;
            this.prev = prev;
        }

        public K getKey() {return key;}
        public V getValue() {return value;}
        public Node<K, V> getPrev() {return prev;}
        @Override
        public String toString() {
            return "Node{" + '\n' +
                    "key=" + key +
                    ", value=" + value +
                    ", prev=" + prev +
                    '}';
        }
    }
    public Node node = null;
    @Override
    public String toString() {
        return "Map{" +
                "node=" + node +
                '}';
    }
    public void Map(){
    }
    public boolean checkKey(K key) {
        boolean result = true;
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (key == currentNode.getKey()) {
                result = false;
            }
        }
        return result;
    }
    void add(K key, V value){
        if(checkKey(key)){
            node = new Node(key, value, node);
        }
    }
    Object get(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev){
            if(currentNode.key == key){
                return currentNode.value;
            }
            if(currentNode.prev != null && currentNode.prev.key == key){
                return currentNode.prev.value;
            }
        }
        return null;
    }
    Object remove(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev){
            if(currentNode.prev != null && currentNode.prev.key == key){
                Node<K, V> removeNode = currentNode.prev.prev;
                currentNode.prev = removeNode;
                return removeNode;
            }
            if(currentNode.key == key){
                Node<K, V> removeNode = currentNode.prev;
                node = removeNode;
                return removeNode != null ? removeNode : null;
            }
        }
        System.out.println("Key = " + key + " không có trong Map");
        return null;
    }

    public static void main(String[] args) {
        customMap map = new customMap();
        map.add(1, 11);
        map.add(2, 22);
        map.add(3, 33);
        map.remove(1);
        System.out.println("get " + map.get(2));
        System.out.println(map);
    }
}
