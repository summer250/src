//20年2月26日课堂代码
//20年3月5日课堂代码
package com.Test2;

//一个类中只能继承一个父类
//public class Student extends Person，A {
public class Student extends Person{
//    private String name;
//    private int age;
    private String SchoolName;

    public Student() {
    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//        当父类中的私有的属性或方法，子类同样可以获取到的
//        只是由于封装性的设计，使得子类不可以直接调用罢了
        this.setName(name);
        this.setAge(age);
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    对父类同名的方法的重写、覆盖

    public void eat() {
        System.out.println("应该多吃有营养的食物");
    }
//
    public void walk() {
            System.out.println("背着书包蹦蹦跳跳的走路");
    }
    public void info () {
        eat();
        System.out.println("我是一个学生");
    }
}