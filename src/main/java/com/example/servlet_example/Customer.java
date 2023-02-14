package com.example.servlet_example;

public class Customer {
    private int id;
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String work;
    private String city;
    private int postNumber;
    private String phone;
    private String mail;

    public Customer(int id, String name, String lastName, String gender, int age, String work, String city, int postNumber, String phone, String mail) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.work = work;
        this.city = city;
        this.postNumber = postNumber;
        this.phone = phone;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public String getCity() {
        return city;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", city='" + city + '\'' +
                ", postNumber=" + postNumber +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
