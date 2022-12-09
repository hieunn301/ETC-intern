package oop.workspace.customTypeData;

public class customQueue {
    private int size = 0;
    private Node front, rear;

    @Override
    public String toString() {
        return "customQueue{" +
                "size=" + size +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

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

    public static void main(String[] args) {
        customQueue queue = new customQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        queue.dequeue();
        queue.first();
    }
}
