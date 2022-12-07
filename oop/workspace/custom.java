package oop.workspace;

//class Node{
//    public int data;
//    public Node nextNode;
//    public Node(int data){this.data = data;}
//    public int getData() {return data;}
//    public Node getNextNode() {return nextNode;}
//    public void setNextNode(Node nextNode) {this.nextNode = nextNode;}
//}
//class Stack{
//    private int size = 0;
//    Node top = null;
//    public boolean isEmpty(){return size == 0;}
//    public void size(){
//        System.out.println("Size: " + size);
//    }
//    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.setNextNode(top);
//        top = newNode;
//        size++;
//        System.out.println("Add: " + data);
//    }
//    public void pop() {
//        if (isEmpty()) {
//            System.out.println("Empty");
//        } else {
//            Node node = top;
//            top = top.getNextNode();
//            size--;
//            System.out.println("Remove: " + node.getData());
//        }
//    }
//    public void peek(){
//        if (isEmpty()) {
//            System.out.println("Empty");
//        } else {
//            System.out.println("Top: " + top.getData());
//        }
//    }
//}
//
//class Queue {
//    private int size = 0;
//    private Node front, rear;
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public int size() {
//        System.out.println("Size: " + size);
//        return size;
//    }
//
//    public void enqueue(int data) {
//        Node node = new Node(data);
//        if (isEmpty()) {
//            front = node;
//        } else {
//            rear.setNextNode(node);
//        }
//        rear = node;
//        size++;
//        System.out.println("Add: " + data);
//    }
//
//    public void dequeue() {
//        if (isEmpty()) {
//            System.out.println("Empty");
//            rear = null;
//        } else {
//            int result = front.getData();
//            front = front.getNextNode();
//            size--;
//            System.out.println("Remove: " + result);
//        }
//    }
//
//    public void first() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//        } else {
//            System.out.println("Front: " + front.getData());
//        }
//    }
//}

abstract class Map<K, V>{
    class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.key = key;
            this.value = value;
            this.prev = prev;
        }
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
    public void Map(){
    }
    void add(K key, V value){
        // trung key???
        node = new Node(key, value, node);
    }

    public boolean containsKey(Object key) {
        if(key != null){
            return false;
        }else{
            return true;
        }
    }

    Object get(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev){
            if(currentNode.key == key){
                return currentNode.value;

            //currentNode.prev = null ????
            }
            if(currentNode.prev == null){
                return null;
            }
            if(currentNode.prev.key == key){
                return currentNode.prev.value;
            }

        }
        return null;
    }

    Object remove(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev){
//            if(currentNode.prev.key == key){
//                Node<K, V> removeNode = currentNode.prev.prev;
//                currentNode.prev = removeNode;
//                return removeNode;
//            }
//            if(currentNode == key){
//                node = node.prev;
//                return currentNode != null ? currentNode : null;
//            }
            if(currentNode.prev.key == key){
                Node<K, V> removeNode = currentNode.prev.prev;
                currentNode.prev = removeNode;
                return removeNode;
            }else if(currentNode.key == key){
                currentNode = currentNode.prev;
                return currentNode != null ? currentNode : null;
            } else if(currentNode.prev.prev.key == key){
//                node.prev = node.prev;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Map{" +
                "node=" + node +
                '}';
    }
}
//
//node1{
//    k key1;
//    v value1;
//    prev1 -> null;
//}
//node2{
//    k key2;
//    v value2;
//    prev2 -> key1;
//}
//node3{
//    k key3;
//    v value3;
//    prev3 -> key2;
//}
//node4{
//    k key4;
//    v value4;
//    prev4 -> key3;
//}
//
//1.next = 3
//3.pre = 1
//
//n.pre.next = n.next
//n.next.pre = n.pre