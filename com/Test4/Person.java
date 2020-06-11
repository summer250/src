//20年3月12日课堂代码
package com.Test4;

public class Person {
    private String name;
    private int age;
    int id=1001;//人的身份证号

    public Person(){
        super();
//        this.name="AA";
//        this.age=1;
    }
    public Person(String name){
        this();
        this.name=name;
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }
}