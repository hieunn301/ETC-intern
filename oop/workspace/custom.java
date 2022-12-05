package oop.workspace;

class Node{
    public int data;
    public Node nextNode;
    public Node(int data){this.data = data;}
    public int getData() {return data;}
    public Node getNextNode() {return nextNode;}
    public void setNextNode(Node nextNode) {this.nextNode = nextNode;}
}
class Stack{
    private int size = 0;
    Node top = null;
    public boolean isEmpty(){return size == 0;}
    public void size(){
        System.out.println("Size: " + size);
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(top);
        top = newNode;
        size++;
        System.out.println("Add: " + data);
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node node = top;
            top = top.getNextNode();
            size--;
            System.out.println("Remove: " + node.getData());
        }
    }
    public void peek(){
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Top: " + top.getData());
        }
    }
}

class Queue {
    private int size = 0;
    private Node front, rear;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        System.out.println("Size: " + size);
        return size;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNextNode(node);
        }
        rear = node;
        size++;
        System.out.println("Add: " + data);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
            rear = null;
        } else {
            int result = front.getData();
            front = front.getNextNode();
            size--;
            System.out.println("Remove: " + result);
        }
    }

    public void first() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + front.getData());
        }
    }
}
class Map<K, V> {
    public static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        public K getKey() {return key;}
        public V getValue() {return value;}
        public void setValue(V value) {this.value = value;}
        public Entry getNext() {return next;}
        public void setNext(Entry<K, V> next) {this.next = next;}
    }
    private int size = 10;
    private final Entry[] table;
    public Map(){table = new Entry[size];}
    private int buckets(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % size);
    }
    public void put(K key, V value){
        int index = buckets(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        if(table[index] == null)
            table[index] = newEntry;
    }
    public void remove(K key){
        int index = buckets(key);
        Entry previous = null;
        Entry entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                entry = entry.getNext();
                table[index] = entry;
                System.out.println("Remove key: " + key);
                return;
            }
        }
    }
    public void display(){
        for(int i = 0; i < size; i++){
            if(table[i] != null){
                Entry currentNode = table[i];
                System.out.printf("Key is %s and value is %s %n", currentNode.getKey(), currentNode.getValue());
            }
        }
    }
}

