//package oop.workspace;
//
//public class Stack<I> {
//    private int size = 100;
//    private int top = 0;
//    private int[] stack = new int[100];
//
//    public boolean isEmpty(){
//        return top == 0 ? true : false;
//    }
//
//    public boolean isFull(){
//        return top == size ? true : false;
//    }
//
//    public boolean push(int item){
//        if(isFull()){
//            System.out.println("Stack full: ");
//        }else{
//            top++;
//            stack[top] = item;
//        }
//        return false;
//    }
//
//    public boolean pop(){
//        if(isEmpty()){
//            System.out.println("Stack null: ");
//        }else{
//            stack[top] = 0;
//            top--;
//        }
//        return false;
//    }
//
//    public int peek(){
//        return stack[top];
//    }
//
//    public void add(I i) {
//    }
//}
