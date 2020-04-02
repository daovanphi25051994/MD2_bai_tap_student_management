package controller;

import model.Student;
import model.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        controller();
    }

    public static void menu() {
        System.out.println("--------------------MENU----------------------");
        System.out.println("1. Add a student ");
        System.out.println("2. Show list students ");
        System.out.println("3. set a student ");
        System.out.println("4. Remove a student ");
        System.out.println("5. Search a student by id ");
        System.out.println("6. Search a student by name ");
        System.out.println("7. Show list student have scholarship ");
        System.out.println("8. Show list female's students");
        System.out.println("Choose : ");
    }

    public static void controller() {
        StudentManagement listStudents = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        String checkContinuous;
        do {
            menu();
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    listStudents.add();
                    break;
                case 2:
                    listStudents.display();
                    break;
                case 3:
                    System.out.println("Enter id");
                    String setId = scanner.nextLine();
                    listStudents.setDataStudentById(setId);
                    break;
                case 4:
                    System.out.println("Enter id");
                    String removeId = scanner.nextLine();
                    listStudents.removeDataStudentById(removeId);
                    break;
                case 5:
                    System.out.println("Enter id");
                    String searchId = scanner.nextLine();
                    Student studentById = listStudents.getDataStudentById(searchId);
                    System.out.println(studentById.toString());
                    break;
                case 6:
                    System.out.println("Enter name");
                    String searchName = scanner.nextLine();
                    Student studentByName = listStudents.getDataStudentByName(searchName);
                    System.out.println(studentByName.toString());
                    break;
                case 7:
                    listStudents.showStudentsHaveScholarship();
                    break;
                case 8:
                    listStudents.showStudentsIsFemale();
                    break;
            }
            System.out.println("Choose Y/N to continuous or exit !!");
            checkContinuous = scanner.nextLine();
        } while (checkContinuous.equals("y"));
    }
}
