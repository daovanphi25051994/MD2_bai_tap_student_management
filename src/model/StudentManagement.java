package model;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement extends Student {
    ArrayList<Student> listStudents = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        Student student = new Student();
        System.out.println("Enter new name : ");
        student.setName(scanner.nextLine());
        System.out.println("Enter new gender : ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter new birthday : ");
        student.setBirthday(scanner.nextLine());
        System.out.println("Enter new address : ");
        student.setAddress(scanner.nextLine());
        System.out.println("Enter new id : ");
        student.setStudentId(scanner.nextLine());
        System.out.println("Enter new average point : ");
        student.setAveragePoint(scanner.nextDouble());
        System.out.println("Enter new email : ");
        scanner.nextLine();
        student.setEmail(scanner.nextLine());
        listStudents.add(student);
    }

    public void display() {
        System.out.println("name    gender    birthday        address     id       average point    email");
        for (Student student : listStudents) {
            System.out.printf("%s%8s%17s%15s%10s%12fl%30s\n", student.getName(), student.getGender(), student.getBirthday(),
                    student.getAddress(), student.getStudentId(), student.getAveragePoint(), student.getEmail());
        }
    }

    public void setDataStudentById(String id) {
        for (Student student : listStudents) {
            if (student.getStudentId().equals(id)) {
                System.out.println("Enter new name : ");
                student.setName(scanner.nextLine());
                System.out.println("Enter new gender : ");
                student.setGender(scanner.nextLine());
                System.out.println("Enter new birthday : ");
                student.setBirthday(scanner.nextLine());
                System.out.println("Enter new address : ");
                student.setAddress(scanner.nextLine());
                System.out.println("Enter new id : ");
                student.setStudentId(scanner.nextLine());
                System.out.println("Enter new average point : ");
                student.setAveragePoint(scanner.nextDouble());
                System.out.println("Enter new email : ");
                scanner.nextLine();
                student.setEmail(scanner.nextLine());
                break;
            }
        }
    }

    public void removeDataStudentById(String id) {
        for (Student student : listStudents) {
            if (student.getStudentId().equals(id)) {
                listStudents.remove(student);
                break;
            }
        }
    }

    public Student getDataStudentById(String id) {
        for (Student student : listStudents) {
            if (student.getStudentId().equals(id)) {
                return student;
            }
        }
        throw new UnsupportedOperationException();
    }

    public Student getDataStudentByName(String name) {
        for (Student student : listStudents) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void showStudentsHaveScholarship() {
        System.out.println("name    gender    birthday        address     id       average point    email");
        for (Student student : listStudents) {
            if (student.getAveragePoint() >= 8.5) {
                System.out.printf("%s%8s%17s%15s%10s%12fl%30s\n", student.getName(), student.getGender(), student.getBirthday(),
                        student.getAddress(), student.getStudentId(), student.getAveragePoint(), student.getEmail());
            }
        }
    }

    public void showStudentsIsFemale() {
        System.out.println("name    gender    birthday        address     id       average point    email");
        for (Student student : listStudents) {
            if (student.getGender().equals("female")) {
                System.out.printf("%s%8s%17s%15s%10s%12fl%30s\n", student.getName(), student.getGender(), student.getBirthday(),
                        student.getAddress(), student.getStudentId(), student.getAveragePoint(), student.getEmail());
            }
        }
    }
}