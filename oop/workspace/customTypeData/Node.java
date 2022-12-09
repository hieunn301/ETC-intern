package oop.workspace.customTypeData;

public class Node {
    public int data;
    public Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = nextNode;
    }
    public int getData() {return data;}
    public Node getNextNode() {return nextNode;}
    public void setNextNode(Node nextNode) {this.nextNode = nextNode;}

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
