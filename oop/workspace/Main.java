package oop.workspace;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ManagerUser managerUser = new ManagerUser();
        ManagerProject managerProject = new ManagerProject();
        while (true){
            System.out.println("Application Manager User/Project");
            System.out.println("Enter 1: To manage user");
            System.out.println("Enter 2: To manage project");
            System.out.println("Enter 3: To exit");
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
                            int id = scanner.nextInt();

                            System.out.print("Enter name: ");
                            scanner.nextLine();
                            String name = scanner.nextLine();

                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter gender: ");
                            String gender = scanner.nextLine();

                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();

                            System.out.print("Enter permission: ");
                            String permission = scanner.nextLine();

                            User user = new User(id, name, age, gender, address, permission);
                            managerUser.addUser(user);
                            System.out.println(user.toString());
                            break;
                        }

                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            managerUser.searchUserByName(name);
                            break;
                        }

                        case "c": {
                            managerUser.showListInfoUser();
                            break;
                        }

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter a: to add Project");
                    System.out.println("Enter b: to search by Project name");
                    System.out.println("Enter c: to show list Project");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter id: ");
                            int id = scanner.nextInt();

                            System.out.print("Enter nameProject: ");
                            scanner.nextLine();
                            String nameProject = scanner.nextLine();

                            System.out.print("Enter description:");
                            String descriptionProject = scanner.nextLine();

                            System.out.print("Enter userId: ");
                            int userId = scanner.nextInt();

                            Project project = new Project(id, nameProject, descriptionProject, userId);
                            managerProject.addProject(project);
                            System.out.println(project.toString());
                            break;
                        }

                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            managerProject.searchProjectByName(name);
                            break;
                        }

                        case "c": {
                            managerProject.showListInfoProject();
                            break;
                        }

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }

                case "3": {
                    return;
                }

                default:
                    System.out.println("Invalid");
            }
        }
    }
}

//1 workspaces(properties: name, description, change private to public)(method: CRUD, invite to workspace)
//        1.1 boards/project(method: CRUD, sort by, search, share)
//        1.1.1 list(properties: )(method: CRUD)
//        1.1.1.1 card/task(properties: description, timeStart, timeEnd)(method: CRUD, members, share, comment, labels(CRUD))
//
//
//        1. Quản lý user:
//
//        a. User   - Properties: idUser, nameUser, email, password, dateOfBirth, address, permission, idDepartment, idTeam, timeStamp
//                  - Method: addUser, editUser, deleteUser, viewUser
//
//        b. Department
//                    - Properties: idDepartment, nameDepartment, idUser, timeStamp
//                    - Method: addDepartment, editDepartment, viewDepartment, deleteDepartment, searchDepartment
//
//        c. Team
//                    - Properties: idTeam, nameTeam, idUser, timeStamp
//                    - Method: addTeam, editTeam, viewTeam, deleteTeam
//
//        mối quan hệ :   Team phụ thuộc vào Department
//                        User phụ thuộc vào Department, Team
//
//        2. Quản lý Project:
//
//        a. Project
//                  - Properties: idProject, nameProject, description, idUser, timeStamp
//                  - Method: addProject, editProject, viewProject, deleteProject, inviteToProject
//
//        b. List
//                  - Properties: idList, nameList, timeStamp
//                  - Method: addList, editList, deleteList, viewList, sortBy, searchList
//
//        c. Task
//                  - Properties: idTask, nameTask, description, timeStamp
//                  - Method: addTask, editTask, viewTask, inviteToTask, comment
//
//        Quan hệ giữa các đối tượng

