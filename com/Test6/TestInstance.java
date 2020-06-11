package com.Test6;

public class TestInstance {
    public static void main(String[] args) {
        TestInstance t = new TestInstance();
        t.method1(new Person());
        System.out.println("********************");
        t.method1(new Student());
        System.out.println("********************");
        t.method1(new Graduate());
    }

    void method1(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Person) {
            System.out.println("a person");
        }
    }
}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
    }

}