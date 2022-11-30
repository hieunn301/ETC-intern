package oop.workspace;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("hieu");
        stack.push(1);
        stack.push(2);
        stack.push(143);
        stack.push(21);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

//        Queue queue = new Queue(5);
//        queue.add(Integer.parseInt("ha"));
//        queue.add(1);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue);
    }
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
    }

