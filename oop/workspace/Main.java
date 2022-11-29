package oop.workspace;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        for(Integer K: map.keySet()){
            System.out.println(K + " " + map.get(K));
        }
        map.clear();
        System.out.println(map);

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

