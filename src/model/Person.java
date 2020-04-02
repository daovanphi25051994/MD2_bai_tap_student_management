package model;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        this.name = scanner.nextLine();
        System.out.println("Enter gender : ");
        this.gender = scanner.nextLine();
        System.out.println("Enter birthday : ");
        this.birthday = scanner.nextLine();
        System.out.println("Enter address : ");
        this.address = scanner.nextLine();
    }

    @Override
    public String toString() {
        return name + "\t\t" + gender + "\t\t" + birthday + "\t\t" + address;
    }
}
