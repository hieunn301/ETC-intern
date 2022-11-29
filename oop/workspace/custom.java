package oop.workspace;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

public class custom<I extends Number, S> {
    class Stack{
        static final int MAX = 10000;
        int top;
        int a[] = new int[MAX];
        boolean isEmpty(){
            return (top < 0);
        }
        Stack(){
            top = -1;
        }

        boolean push(int x){
            if (top >= (MAX - 1)) {
                System.out.println("Stack đầy");
                return false;
            }else {
                a[++top] = x;
                System.out.println(x + " được đẩy vào ngăn xếp");
                return true;
            }
        }

        int pop(){
            if (top < 0) {
                System.out.println("Stack rỗng");
                return 0;
            }else {
                int x = a[top--];
                return x;
            }
        }

        int peek(){
            if (top < 0) {
                System.out.println("Stack rỗng");
                return 0;
            }else {
                int x = a[top];
                return x;
            }
        }
    }
    class Queue{
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enQueue (int data){
            if(!isFull()){
                queue[rear] = data;
                rear++;
                size++;
            }else{
                System.out.println("Hàm đợi đầy");
            }
        }

        public int deQueue(){
            int data = queue[front];
            if(!isEmpty()){
                front++;
                size--;
            }else{
                System.out.println("Hàm đợi rỗng");
            }
            return data;
        }

        public int getSize(){
            return size;
        }

        public boolean isEmpty(){
            return getSize() == 0;
        }

        public boolean isFull(){
            return getSize() == size;
        }
    }

    class Map{
        public class Entry<K, V>{
            private Key K;
            private Value V;

            public Entry(Key k, Value v) {
                K = k;
                V = v;
            }

        }
    }

}
