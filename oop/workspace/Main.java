package oop.workspace;

import javafx.concurrent.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerUser managerUser = new ManagerUser();
        while (true){
            System.out.println("Application Manager User");
            System.out.println("Enter 1: To insert user");
            System.out.println("Enter 2: To search  user");
            System.out.println("Enter 3: To show information user");
            System.out.println("Enter 4: To exit");
            String line = scanner.nextLine();
            switch (line){
                case "1": {
                    System.out.println("Enter a: to insert User");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = scanner.nextLine();
                            User staff = new Staff(name, age, gender, address, branch);
                            managerUser.addUser(staff);
                            System.out.println(staff.toString());
                            break;
                        }

                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            String level = String.valueOf(scanner.nextInt());

                            String nameProject = null;
                            String timeStart = null;
                            String timeEnd = null;
                            String description = null;
                            String status = null;
                            String activity = null;

                            User project = new User(nameProject,timeStart,timeEnd,description,status, activity);
                            managerUser.addUser(project);
                            System.out.println(project.toString());
                            scanner.nextLine();
                            break;
                        }

                        case "c": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            User staff = new Staff(name, age, gender, address, task);
                            managerUser.addUser(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerUser.searchUserByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerUser.showListInforUser();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
