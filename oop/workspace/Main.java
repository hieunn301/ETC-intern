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

//        a. User   - Properties: idUser, nameUser, email, password, dateOfBirth, address, permission, idDepartment, idTeam, timeStamp
//                  - Method: Add User, Edit User, Delete User, Read User, Add List, Edit List, Delete List, Read User

//        b. Department
//                    - Properties: idDepartment, nameDepartment, idUser, timeStamp
//                    - Method: Add Department, Edit Department, Read Department, Delete Department

//        c. Team
//                    - Properties: idTeam, nameTeam, idUser, timeStamp
//                    - Method: Add Team, Edit Team, Read Team, Delete Team

//        mối quan hệ :   Team phụ thuộc vào Department
//                        User phụ thuộc vào Department, Team
//
//        b. Admin
//        - Thuộc tính: idUser, name, email, password, age, address, permission, idPhong
//        - Phương thức: thêm, sửa, xóa user, xem chi tiết user
//        c. Trưởng phòng
//        - Thuộc tính: idUser, name, email, password, age, address, permission, idPhong
//        - Phương thức: thêm, sửa, xóa user, xem chi tiết user, phê duyệt các yêu cầu từ nhân viên.
//        d. Leader quản lý 1 team
//        - Thuộc tính: idUser, name, email, password, age, address, permission, idPhong, idTeam
//        - Phương thức: xem chi tiết user, đăng ký
//        e. Nhân viên
//        - Thuộc tính: idUser, name, email, password, age, address, permission, idPhong, idTeam
//        - Phương thức: xem chi tiết user, đăng ký
//
//
//        Quan hệ giữa các đối tượng: 	- nhân viên, lead, trưởng phòng, admin kế thừa từ user
//        - nhân viên và trưởng phòng là quan hệ kết hợp(Association)
//
//        2. Quản lý Project:
//        a. Project (ví dụ làm dự án về giải pháp giáo dục)
//        - Thuộc tính: idProject, nameProject, description, idUser
//        - Phương thức: thêm, sửa xóa, xem chi tiết project, mời người vào dự án
//        b. List(các bước để hoàn thành dự án)
//        - Thuộc tính: idList, nameList
//        - Phương thức: thêm, sửa, xóa, xem chi tiết danh sách công việc, sắp xếp, tìm kiếm
//        c. Task(danh sách công việc của mỗi bước làm dự án )
//        - Thuộc tính: idTask, nameTask, description, timeStart, timeEnd
//        - Phương thức: thêm, sửa xóa, xem chi tiết task, thêm người vào task, bình luận, thêm liên kết.
//
//        Quan hệ giữa các đối tượng
