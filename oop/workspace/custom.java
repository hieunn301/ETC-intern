package oop.workspace;

//class Stack<E>{
//    int MAX = 1000;
//    int top;
//    int a[] = new int[MAX];
//    boolean isEmpty(){
//        return (top < 0);
//    }
////    Stack(){
////        top = -1;
////    }
//    public void sayHello(){
//        int n = 0;
//        System.out.println("nhap gi tri max: " + n);
//    }
//    boolean push(int x){
//        if (top >= (MAX - 1)) {
//            System.out.println("Stack đầy");
//            return false;
//        }else {
//            a[++top] = x;
//            System.out.println(x + " được đẩy vào ngăn xếp");
//            return true;
//        }
//    }
//
//     public int pop(){
//        if (top < 0) {
//            System.out.println("Stack rỗng");
//            System.exit(-1);
//        }else {
//            int x = a[top--];
//            return x;
//        }
//         return 0;
//     }
//
//    int peek(){
//        if (top < 0) {
//            System.out.println("Stack rỗng");
//            return top;
//        }else {
//            int x = a[top];
//            return x;
//        }
//    }
//
//}

class Stack{
    private Object arr[];
    private int top;
    private int max;
    Stack(int size){
        arr = new String[size];
        max = size;
        top = -1;
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == max - 1;
    }
    public Object push(Object x){
        if (isFull()){
            System.out.println("Ngăn xếp đầy");
        }
        System.out.println("Thêm " + x);
        arr[++top] = String.valueOf(x);
        return x;
    }
    public Object pop(){
        if (isEmpty()){
            System.out.println("Ngăn xếp rỗng");
        }
        System.out.println("Xóa " + peek());
        return arr[top--];
    }
    public Object peek(){
        if (!isEmpty()) {
            return arr[top];
        }else {
            System.out.println("Ngăn xếp rỗng");
            return null;
        }
    }
}

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int max;
    private int count;
    Queue(int size){
        arr = new int[size];
        max = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    public int remove() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
            System.exit(-1);
        }
        int x = arr[front];
        System.out.println("Xóa " + x);
        front = (front + 1) % max;
        count--;

        return x;
    }
    public void add(int item){
        if (isFull()){
            System.out.println("Hàng đợi đầy");
            System.exit(-1);
        }
        System.out.println("Thêm " + item);
        rear = (rear + 1) % max;
        arr[rear] = item;
        count++;
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
            System.exit(-1);
        }
        return arr[front];
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == max);
    }
}
//class Map{
//    public class Entry<K, V>{
//        private Key K;
//        private Value V;
//
//        public Entry(Key k, Value v) {
//            K = k;
//            V = v;
//        }
//
//    }
//}

