package oop.workspace;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ManagerUser managerUser = new ManagerUser();
        ManagerProject managerProject = new ManagerProject();
            while (true){
                    System.out.println("Application Manager User/Project");
                    System.out.println("Enter 1: To manage user");
                    String line = scanner.nextLine();
                    switch (line){
                    case "1": {
                    System.out.println("Enter a: to add User");
                    System.out.println("Enter b: to search by User name");
                    System.out.println("Enter c: to show list User");
                    String type = scanner.nextLine();
                    switch (type) {
                    case "a": {
                        System.out.print("Enter id: ");
                        int idUser = scanner.nextInt();

                        System.out.print("Enter name: ");
                        scanner.nextLine();
                        String nameUser = scanner.nextLine();

                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();

                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();

                        System.out.print("Enter dateOfBirth: ");
                        String dates = scanner.nextLine();
                        SimpleDateFormat dateOfBirth = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = dateOfBirth.parse(dates);


                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();

                        System.out.print("Enter permission: ");
                        String permission = scanner.nextLine();

                        System.out.print("Enter createdAt: ");
                        String createdAt = scanner.nextLine();

                        System.out.print("Enter updatedAt: ");
                        String updatedAt = scanner.nextLine();

                        User user = new User(idUser, nameUser, email, password, date, address, permission, "Thu Dec 31 00:00:00 IST 1998", "Thu Dec 31 00:00:00 IST 2000");
                        managerUser.addUser(user);
                        System.out.println(user.toString());
                        break;
                        }
                    }
            }
        }
    }
    }
}



//
//    Scanner scanner = new Scanner(System.in);
//    ManagerUser managerUser = new ManagerUser();
//    ManagerProject managerProject = new ManagerProject();
//        while (true){
//                System.out.println("Application Manager User/Project");
//                System.out.println("Enter 1: To manage user");
//                System.out.println("Enter 2: To manage project");
//                System.out.println("Enter 3: To exit");
//                String line = scanner.nextLine();
//                switch (line){
//                case "1": {
//                System.out.println("Enter a: to add User");
//                System.out.println("Enter b: to search by User name");
//                System.out.println("Enter c: to show list User");
//                String type = scanner.nextLine();
//                switch (type) {
//                case "a": {
//                System.out.print("Enter id: ");
//                int id = scanner.nextInt();
//
//                System.out.print("Enter name: ");
//                scanner.nextLine();
//                String name = scanner.nextLine();
//
//                System.out.print("Enter age:");
//                int age = scanner.nextInt();
//                scanner.nextLine();
//
//                System.out.print("Enter gender: ");
//                String gender = scanner.nextLine();
//
//                System.out.print("Enter address: ");
//                String address = scanner.nextLine();
//
//                System.out.print("Enter permission: ");
//                String permission = scanner.nextLine();
//
//                User user = new User(id, name, age, gender, address, permission);
//                managerUser.addUser(user);
//                System.out.println(user.toString());
//                break;
//                }
//
//                case "b": {
//                System.out.print("Enter name: ");
//                String name = scanner.nextLine();
//                managerUser.searchUserByName(name);
//                break;
//                }
//
//                case "c": {
//                managerUser.showListInfoUser();
//                break;
//                }
//
//default:
//        System.out.println("Invalid");
//        break;
//        }
//        break;
//        }
//
//        case "2": {
//        System.out.println("Enter a: to add Project");
//        System.out.println("Enter b: to search by Project name");
//        System.out.println("Enter c: to show list Project");
//        String type = scanner.nextLine();
//        switch (type) {
//        case "a": {
//        System.out.print("Enter id: ");
//        int id = scanner.nextInt();
//
//        System.out.print("Enter nameProject: ");
//        scanner.nextLine();
//        String nameProject = scanner.nextLine();
//
//        System.out.print("Enter description:");
//        String descriptionProject = scanner.nextLine();
//
//        System.out.print("Enter userId: ");
//        int userId = scanner.nextInt();
//
//        Project project = new Project(id, nameProject, descriptionProject, userId);
//        managerProject.addProject(project);
//        System.out.println(project.toString());
//        break;
//        }
//
//        case "b": {
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        managerProject.searchProjectByName(name);
//        break;
//        }
//
//        case "c": {
//        managerProject.showListInfoProject();
//        break;
//        }
//
//default:
//        System.out.println("Invalid");
//        break;
//        }
//        break;
//        }
//
//        case "3": {
//        return;
//        }
//
//default:
//        System.out.println("Invalid");
//        }
//        }
