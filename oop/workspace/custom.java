package oop.workspace;

class Stack{
    StackNode root;

    public class StackNode {
        public int data;
        public StackNode next;

        public StackNode(int data) { this.data = data; }
    }

    public boolean isEmpty() {
//        if (root == null) {
//            return true;
//        }
//        else
//            return false;
        return root == null ? true : false;

    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " duoc them vao stack");
    }

    public String pop() {
        String popped = null;
        if (root == null) {
            System.out.println("Stack rong");
        } else {
            popped = String.valueOf(root.data);
            root = root.next;
        }
        return popped;
    }

    public String peek() {
        if (root == null) {
            System.out.println("Stack rong");
            return null;
        } else {
            return String.valueOf(root.data);
        }
    }
}