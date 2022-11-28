package oop.workspace;

import java.util.Stack;

class Main {
    static class Stack {
        static final int MAX = 1000;
        int top;
        int a[] = new int[MAX]; // Maximum size of Stack

        boolean isEmpty()
        {
            return (top < 0);
        }
        Stack()
        {
            top = -1;
        }

        boolean push(int x)
        {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            }
            else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }

        int pop()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top--];
                return x;
            }
        }

        int peek()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top];
                return x;
            }
        }
    }
    public static void main(String[] args) {
        Stack integerStack = new Stack();

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack.pop() + " Popped from stack");



//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter id: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter nameUser: ");
//        String nameUser = scanner.nextLine();
//
//        System.out.print("Enter email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Enter password: ");
//        String password = scanner.nextLine();
//
//        System.out.print("Enter dateOfBirth: ");
//        String dateOfBirth = scanner.nextLine();
//
//        System.out.print("Enter address: ");
//        String address = scanner.nextLine();
//
//        System.out.print("Enter permission: ");
//        String permission = scanner.nextLine();
//
////        System.out.print("Enter isAvailable: ");
////        Boolean isAvailable = true;
//
//        System.out.print("Enter createdAt: ");
//        String createdAt = scanner.nextLine();
//
//        System.out.print("Enter updatedAt: ");
//        String updatedAt = scanner.nextLine();
//
//        System.out.print("Enter idTeam: ");
//        int idTeam = scanner.nextInt();
//        scanner.nextLine();
//
//        User user = new User( id, nameUser, email, password, dateOfBirth, address, permission, true, createdAt, updatedAt, idTeam);
//        User.addUser(user);
//        System.out.println(user.toString());
//        user.getId();

//            Stack integerStack = new Stack();
//            integerStack.push(1);
//            integerStack.push(2);
//            integerStack.push(3);
//            integerStack.push(4);
//            integerStack.push(5);
//            System.out.println(integerStack.pop());
        }

}
