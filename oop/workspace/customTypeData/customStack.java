package oop.workspace.customTypeData;

public class customStack {
    private int size = 0;
    Node top = null;

    @Override
    public String toString() {
        return "customStack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }
    public customStack() {
    }
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


    public static void main(String[] args) {
        customStack stack = new customStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        stack.peek();
    }
}
