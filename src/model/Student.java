package model;

import java.util.Scanner;

public class Student extends Person {
    public static final int POINT_SCHOLARSHIP = 8;
    private String studentId;
    private double averagePoint;
    private String email;

    public Student() {
    }

    public Student(String name, String gender, String birthday, String address, String studentId, double averagePoint, String email) {
        super(name, gender, birthday, address);
        this.studentId = studentId;
        this.averagePoint = averagePoint;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public String getEmail() {
        return email;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        this.setName(scanner.nextLine());
        System.out.println("Enter gender : ");
        this.setGender(scanner.nextLine());
        System.out.println("Enter birthday : ");
        this.setBirthday(scanner.nextLine());
        System.out.println("Enter address : ");
        this.setAddress(scanner.nextLine());
        System.out.println("Enter ID : ");
        this.setStudentId(scanner.nextLine());
        System.out.println("Enter average point : ");
        this.setAveragePoint(scanner.nextDouble());
        System.out.println("Enter email : ");
        scanner.nextLine();
        this.setEmail(scanner.nextLine());
    }

    @Override
    public String toString() {
        return this.getName() + "\t\t" + this.getGender() + "\t\t" + this.getBirthday() + "\t\t" + this.getAddress()
                + "\t\t" + studentId + "\t\t" + averagePoint + "\t\t\t\t" + email;
    }

    public boolean isScholarship() {
        if (this.averagePoint >= POINT_SCHOLARSHIP) {
            return true;
        } else {
            return false;
        }
    }
}
